package org.sm.dpc.behavioral.interpreter;

import java.util.Map;

class Minus implements Expression {
	Expression leftOperand;
	Expression rightOperand;

	public Minus(Expression left, Expression right) {
		leftOperand = left;
		rightOperand = right;
	}

	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}
}