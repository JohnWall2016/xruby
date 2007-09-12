/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class InstanceVariableExpression extends VariableExpression {
	private final String value_;
	
	public String getValue() {
		return value_.toString();
	}

	public InstanceVariableExpression(String value) {
		value_ = value;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitInstanceVariableExpression(value_);
	}

	public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign) {
		visitor.visitInstanceVariableAssignmentOperator(value_, rhs_is_method_call, is_multiple_assign);
	}
}
