/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class YieldExpressionTest extends TestingAstTestCase {
	public void test_nil() {
		Program p = getProgram("yield nil");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"yield\n" +
			"[:1\n" +
			"[\n" +
			"nil\n" +
			"]\n" +
			"end yield:true\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
	public void test_asterisk_nil() {
		Program p = getProgram("yield *nil");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"yield\n" +
			"*[:0\n" +
			"[\n" +
			"nil\n" +
			"]*\n" +
			"end yield:false\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
	
}