/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelObject;

@RubyLevelObject(objectClass="Object")
public class RubyTopSelf {
    @RubyLevelMethod(name="include", singleton=true)
    public static RubyValue include(RubyValue receiver) {
        assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);
        return RubyRuntime.ObjectClass;
    }

    @RubyLevelMethod(name="include", singleton=true)
    public static RubyValue include(RubyValue receiver, RubyValue arg) {
        assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);
        RubyRuntime.ObjectClass.include(arg);
        return RubyRuntime.ObjectClass;
    }

    @RubyLevelMethod(name="include", singleton=true)
    public static RubyValue include(RubyValue receiver, RubyArray args) {
        assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);
        RubyRuntime.ObjectClass.include(args);
        return RubyRuntime.ObjectClass;
    }
}
