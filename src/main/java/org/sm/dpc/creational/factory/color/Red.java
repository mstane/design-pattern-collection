package org.sm.dpc.creational.factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {
	
	private static final Logger logger = LoggerFactory.getLogger(Red.class);

	@Override
	public void fill() {
		logger.debug("Inside Red::fill() method.");
	}
}
