package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		logger.debug("Inside Rectangle::draw() method.");
	}
}
