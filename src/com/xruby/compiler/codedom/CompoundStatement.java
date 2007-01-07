/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

public class CompoundStatement implements Visitable {
	protected ArrayList<Statement> statements_ = new ArrayList<Statement>();

	public void addStatement(Statement statement) {
		if (null != statement) {
			//optimazation: remove dead code
			if (statement instanceof ExpressionStatement) {
				if (!((ExpressionStatement)statement).getExpression().willNotBeExecuted()) {
					statements_.add(statement);
				}
			} else {
				statements_.add(statement);
			}
		}
	}

	int size() {
		return statements_.size();
	}
	
	boolean lastStatementHasReturnValue() {
		if (statements_.isEmpty()) {
			return false;
		}
		else if (statements_.get(statements_.size() - 1) instanceof ExpressionStatement) {
			ExpressionStatement e = (ExpressionStatement)statements_.get(statements_.size() - 1);
			if (e.getExpression() instanceof ReturnExpression ||
				e.getExpression() instanceof BreakExpression ||
				e.getExpression() instanceof NextExpression ||
				e.getExpression() instanceof RedoExpression) {
				return false;
			} else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (Statement s : statements_) {
			s.getNewlyAssignedVariables(symboltable, result);
		}
	}

	public void accept(CodeVisitor visitor) {

		int i = 0;
		for (Statement statement : statements_) {
			++i;
			statement.accept(visitor);

			if (statement instanceof ExpressionStatement && (i != statements_.size())) {
				visitor.visitTerminal();
			}
		}
	}
}
