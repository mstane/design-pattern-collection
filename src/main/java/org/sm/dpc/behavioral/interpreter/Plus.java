package org.sm.dpc.behavioral.interpreter;

import java.util.Map;

class Plus implements Expression {
	Expression leftOperand;
	Expression rightOperand;

	public Plus(Expression left, Expression right) {
		leftOperand = left;
		rightOperand = right;
	}

	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) + rightOperand.interpret(variables);
	}
}
