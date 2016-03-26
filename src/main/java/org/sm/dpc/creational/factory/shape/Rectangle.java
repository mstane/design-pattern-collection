package org.sm.dpc.creational.factory.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

	@Override
	public void draw() {
		logger.debug("Inside Rectangle::draw() method.");
	}
}
