package org.sm.dpc.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplatePatternDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(TemplatePatternDemo.class);
	
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		logger.debug("\n");
		game = new Football();
		game.play();
	}
}
