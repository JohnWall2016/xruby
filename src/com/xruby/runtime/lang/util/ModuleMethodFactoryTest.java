/**
 * Copyright 2007 Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang.util;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyValue;

import junit.framework.TestCase;

public class ModuleMethodFactoryTest extends TestCase {
	private MethodFactory f;
	
	protected void setUp() throws Exception {
        this.f = MethodFactory.createMethodFactory(Module.class, true);
    }

    protected void tearDown() throws Exception {
        this.f = null;
    }
    
	public void testModuleMethod() {
		RubyMethod m = this.f.getMethod("test", MethodType.NO_ARG);
		assertNotNull(m);
		RubyValue result = m.invoke(RubyConstant.QNIL, null);
		assertEquals(RubyConstant.QNIL, result);
    }
	
	public static class Module {
    	public static RubyValue test(RubyValue receiver) {
    		return receiver;
    	}
    }
}
