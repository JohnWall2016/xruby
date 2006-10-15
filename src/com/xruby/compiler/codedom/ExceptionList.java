/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class ExceptionList {

	private ArrayList<Expression> arguments_ = new ArrayList<Expression>();
	private LocalVariableExpression var_ = null;
	
	public void addArgument(Expression v) {
		arguments_.add(v);
	}
	
	public void addExceptionVariable(LocalVariableExpression v) {
		var_ = v;
	}
	
	public Object accept(CodeVisitor visitor, Object excepton_var) {

		if (arguments_.isEmpty()) {
			visitor.visitNoParameter();
		} else {
			ArrayExpression a = new ArrayExpression(arguments_, null);
			a.accept(visitor, false);
		}

		if (null != var_) {
			var_.accept(visitor);
		}

		return visitor.visitRescueVariable((null != var_) ? var_.getValue() : null, excepton_var);
	}

}