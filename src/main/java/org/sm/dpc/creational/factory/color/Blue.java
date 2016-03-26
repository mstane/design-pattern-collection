package org.sm.dpc.creational.factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {
	
	private static final Logger logger = LoggerFactory.getLogger(Blue.class);

	@Override
	public void fill() {
		logger.debug("Inside Blue::fill() method.");
	}
}
