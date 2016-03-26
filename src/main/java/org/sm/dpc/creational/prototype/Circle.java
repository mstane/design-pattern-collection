package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Circle.class);

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		logger.debug("Inside Circle::draw() method.");
	}
}
