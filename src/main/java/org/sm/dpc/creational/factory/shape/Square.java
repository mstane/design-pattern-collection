package org.sm.dpc.creational.factory.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Square.class);

	@Override
	public void draw() {
		logger.debug("Inside Square::draw() method.");
	}
}
