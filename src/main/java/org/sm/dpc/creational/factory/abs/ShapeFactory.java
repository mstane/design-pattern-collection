package org.sm.dpc.creational.factory.abs;

import org.sm.dpc.creational.factory.color.Color;
import org.sm.dpc.creational.factory.shape.Circle;
import org.sm.dpc.creational.factory.shape.Rectangle;
import org.sm.dpc.creational.factory.shape.Shape;
import org.sm.dpc.creational.factory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	Color getColor(String color) {
		return null;
	}
}