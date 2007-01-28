package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;
import java.math.BigInteger;

/*
 * @see http://headius.com/rubyspec/index.php/Marshaling
 */
class MarshalDumper {
	private static void packInteger(RubyFixnum v, StringBuilder sb) {
		sb.append('i');
		packInteger(v.intValue(), sb);
	}
	
	private static void packInteger(int v, StringBuilder sb) {
		if (0 == v) {
			sb.append((char)0);
		} else {
			sb.append((char)(v + 5));
		}
	}
	
	private static void packString(RubyString v, StringBuilder sb) {
		sb.append('"');
		packInteger(v.length(), sb);
		sb.append(v);
	}

	private static void packSymbol(RubySymbol v, StringBuilder sb) {
		sb.append(':');
		packInteger(v.toString().length(), sb);
		sb.append(v.toString());
	}
	
	private static void packArray(RubyArray v, StringBuilder sb) {
		sb.append('[');
		packInteger(v.size(), sb);
		for (RubyValue a : v) {
			packValue(a, sb);
		}
	}
	
	private static void packHash(RubyHash v, StringBuilder sb) {
		sb.append('{');
		packInteger(v.size(), sb);
		RubyArray keys = v.keys();
		for (RubyValue a : keys) {
			packValue(a, sb);
			packValue(v.get(a), sb);
		}
	}

	private static void packFloat(RubyFloat v, StringBuilder sb) {
		sb.append('f');
		String s = Double.toString(v.doubleValue());
		packInteger(s.length(), sb);
		sb.append(s);
	}
	
	private static void packBignum(RubyBignum v, StringBuilder sb) {
		sb.append('l');
		BigInteger biginteger = v.getInternal();
		
		if (biginteger.compareTo(BigInteger.ZERO) > 0) {
			sb.append('+');
		} else {
			sb.append('-');
		}
		
		int size = v.size();
		sb.append((char)size);
		
		byte[] bytes = new byte[size];
		byte[] orig = biginteger.toByteArray();
		System.arraycopy(orig, 0, bytes, size - orig.length, orig.length);
		for (int i = size - 1; i >= 0; --i) {
			int c = bytes[i];
			sb.append((char)(c & 0xff));
		}
	}
	
	private static void packObject(RubyValue v, StringBuilder sb) {
		sb.append("C:");
		String s = v.getRubyClass().getName();
		packInteger(s.length(), sb);
		sb.append(s);

		if (v instanceof RubyString) {
			packString((RubyString)v, sb);
		} else {
			throw new RubyException("not implemented");
		}
	}
	
	private static void packValue(RubyValue v, StringBuilder sb) {
		if (v == ObjectFactory.nilValue) {
			sb.append((char)0);
		} else if (v == ObjectFactory.trueValue) {
			sb.append('T');
		} else if (v == ObjectFactory.falseValue) {
			sb.append('F');
		} else if (v.getRubyClass() == RubyRuntime.StringClass) {
			packString((RubyString)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.SymbolClass) {
			packSymbol((RubySymbol)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.FixnumClass) {
			packInteger((RubyFixnum)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.ArrayClass) {
			packArray((RubyArray)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.HashClass) {
			packHash((RubyHash)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.FloatClass) {
			packFloat((RubyFloat)v, sb);
		} else if (v.getRubyClass() == RubyRuntime.BignumClass) {
			packBignum((RubyBignum)v, sb);
		} else {
			packObject(v, sb);
		}
	}
	
	public static RubyString dump(RubyValue v) {
		StringBuilder sb = new StringBuilder();
		
		//version
		sb.append((char)4);
		sb.append((char)8);
		
		packValue(v, sb);
		
		return ObjectFactory.createString(sb);
	}
}

class MarshalLoader {
	private int current_index_ = 0;
	
	private int loadInteger(String v) {
		char c = v.charAt(current_index_);
		++current_index_;
		if (0 == c) {
			return c;
		} else {
			return c - 5;
		}
	}

	private RubyFloat loadFloat(String v) {
		int length = loadInteger(v);
		String s = v.substring(current_index_, current_index_ + length);
		double d = Double.parseDouble(s);
		current_index_ += length;
		return ObjectFactory.createFloat(d);
	}

	private RubySymbol loadSymbol(String v) {
		return ObjectFactory.createSymbol(_loadString(v));
	}
	
	private RubyString loadString(String v) {
		return ObjectFactory.createString(_loadString(v));
	}

	private String _loadString(String v) {
		int length = loadInteger(v);
		String s = v.substring(current_index_, current_index_ + length);
		current_index_ += length;
		return s;
	}
	
	private RubyArray loadArray(String v) {
		int length = loadInteger(v);
		RubyArray a = new RubyArray(length);
		for (int i = 0; i < length; ++i) {
			RubyValue value = loadValue(v);
			a.add(value);
		}
		return a;
	}
	
	private RubyHash loadHash(String v) {
		int length = loadInteger(v);
		RubyHash h = ObjectFactory.createHash();
		for (int i = 0; i < length; ++i) {
			RubyValue k = loadValue(v);
			RubyValue value = loadValue(v);
			h.add(k, value);
		}
		return h;
	}
	
	private RubyBignum loadBignum(String v) {
		char sign = v.charAt(current_index_++);
		char length = v.charAt(current_index_++);
	
		BigInteger biginteger = BigInteger.valueOf(0);
		for (int i = 0; i < length; ++i) {
			BigInteger tmp = BigInteger.valueOf(v.charAt(current_index_ + i));
			tmp = tmp.shiftLeft(i * 8);
			biginteger = biginteger.add(tmp);
		}
	
		current_index_ += length;
		return ObjectFactory.createBignum(biginteger);
	}

	private RubyValue loadObject(String v) {
		++current_index_;//ignore ':'
		String class_name = _loadString(v);
		RubyValue r = loadValue(v);
		r.setRubyClass((RubyClass)RubyAPI.getConstant(RubyRuntime.GlobalScope, class_name));
		return r;
	}
	
	private RubyValue loadValue(String v) {
		char c = v.charAt(current_index_); 
		++current_index_;
		switch (c) {
		case '\0':
			return ObjectFactory.nilValue;
		case 'T':
			return ObjectFactory.trueValue;
		case 'F':
			return ObjectFactory.falseValue;
		case 'i':
			return ObjectFactory.createFixnum(loadInteger(v));
		case '"':
			return loadString(v);
		case ':':
			return loadSymbol(v);
		case '[':
			return loadArray(v);
		case '{':
			return loadHash(v);
		case 'f':
			return loadFloat(v);
		case 'l':
			return loadBignum(v);
		case 'C':
			return loadObject(v);
		default:
			throw new RubyException("not implemented " + c);	
		}
	}
	
	public RubyValue load(RubyString s) {
		String v = s.toString();
		if (v.length() <= 2) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "marshal data too short");
		} else if (v.charAt(0) != 4 && v.charAt(1) != 8) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "incompatible marshal file format (can't be read)");
		} else {
			current_index_ += 2;
			return loadValue(v);
		}
	}
}

class Marshal_dump extends RubyMethod {
	public Marshal_dump() {
		super(1);
	}
		
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return MarshalDumper.dump(args.get(0));
	}
}

class Marshal_load extends RubyMethod {
	
	public Marshal_load() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		MarshalLoader loader = new MarshalLoader(); 
		return loader.load((RubyString)args.get(0));
	}
}

public class MarshalModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MarshalModule;
		m.defineMethod("dump", new Marshal_dump());
		RubyMethod load = new Marshal_load();
		m.defineMethod("load", load);
		m.defineMethod("restore", load);
	}
}
