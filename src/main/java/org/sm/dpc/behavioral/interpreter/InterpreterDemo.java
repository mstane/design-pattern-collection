package org.sm.dpc.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterpreterDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(InterpreterDemo.class);

	public static void main(String[] args) {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		Map<String, Expression> variables = new HashMap<String, Expression>();
		variables.put("w", new Number(5));
		variables.put("x", new Number(10));
		variables.put("z", new Number(42));
		int result = sentence.interpret(variables);
		logger.debug(String.valueOf(result));
	}

}
