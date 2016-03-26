package org.sm.dpc.creational.factory.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Green implements Color {
	
	private static final Logger logger = LoggerFactory.getLogger(Green.class);

	@Override
	public void fill() {
		logger.debug("Inside Green::fill() method.");
	}
	
}