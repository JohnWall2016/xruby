package com.xruby.runtime.builtin;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class ArrayPackerTest extends TestCase {
	public void test_pack() {
		StringBuilder s = ArrayPacker.pack(new RubyArray(ObjectFactory.fixnum1), "q");
		String expected = new String(new char[] {1, 0, 0, 0, 0, 0, 0, 0});
		assertEquals(expected.length(), s.toString().length());
	}
	
	public void test_unpack_empty() {
		RubyArray a = ArrayPacker.unpack("", "q");
		assertEquals(1, a.size());
		assertEquals(ObjectFactory.nilValue, a.get(0));
	}
	
	public void test_unpack() {
		String s = new String(new char[] {1, 0, 0, 0, 0, 0, 0, 0});
		RubyArray a = ArrayPacker.unpack(s, "q");
		assertEquals(1, a.size());
		assertEquals(ObjectFactory.fixnum1, a.get(0));
	}
}
