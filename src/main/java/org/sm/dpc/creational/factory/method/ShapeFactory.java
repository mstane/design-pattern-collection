package org.sm.dpc.creational.factory.method;

import org.sm.dpc.creational.factory.shape.Circle;
import org.sm.dpc.creational.factory.shape.Rectangle;
import org.sm.dpc.creational.factory.shape.Shape;
import org.sm.dpc.creational.factory.shape.Square;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
