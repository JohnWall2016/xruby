package com.xruby.codedom;

public class BreakExpressionTest extends TestingAstTestCase {
	public void test_break_1() {
		Program p = getProgram("break 1");
		CodePrinter cp = new CodePrinter();
		p.accept(cp);
		String expected_result = 
			"begin break\n" +
			"1\n" +
			"end break\n" +
			"EOF";
		assertEquals(expected_result, cp.toString());
	}
}