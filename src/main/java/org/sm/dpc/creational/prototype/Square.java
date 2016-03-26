package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Square.class);

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		logger.debug("Inside Square::draw() method.");
	}
}
