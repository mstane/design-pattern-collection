package org.sm.dpc.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

class Evaluator implements Expression {
	private Expression syntaxTree;

	public Evaluator(String expression) {
		Stack<Expression> expressionStack = new Stack<Expression>();
		for (String token : expression.split(" ")) {
			if (token.equals("+")) {
				Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
				expressionStack.push(subExpression);
			} else if (token.equals("-")) {
				// it's necessary remove first the right operand from the stack
				Expression right = expressionStack.pop();
				// ..and after the left one
				Expression left = expressionStack.pop();
				Expression subExpression = new Minus(left, right);
				expressionStack.push(subExpression);
			} else
				expressionStack.push(new Variable(token));
		}
		syntaxTree = expressionStack.pop();
	}

	public int interpret(Map<String, Expression> context) {
		return syntaxTree.interpret(context);
	}
}
