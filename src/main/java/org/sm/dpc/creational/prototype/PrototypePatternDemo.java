package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypePatternDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(PrototypePatternDemo.class);
	
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		logger.debug("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		logger.debug("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		logger.debug("Shape : " + clonedShape3.getType());
	}
}
