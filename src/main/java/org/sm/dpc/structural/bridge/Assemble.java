package org.sm.dpc.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete implementation 2 for bridge pattern
 * */
public class Assemble implements Workshop {
	
	private static final Logger logger = LoggerFactory.getLogger(Assemble.class);

	@Override
	public void work() {
		logger.debug(" Assembled.");
	}

}
