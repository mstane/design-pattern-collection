package org.sm.dpc.creational.factory.abs;

import org.sm.dpc.creational.factory.color.Blue;
import org.sm.dpc.creational.factory.color.Color;
import org.sm.dpc.creational.factory.color.Green;
import org.sm.dpc.creational.factory.color.Red;
import org.sm.dpc.creational.factory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}
