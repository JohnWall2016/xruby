/**
 * Copyright 2007 Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang.annotation;

public @interface UndefMethod {
	String name();
	boolean classMethod() default false;
}
