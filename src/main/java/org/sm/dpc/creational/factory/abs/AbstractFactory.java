package org.sm.dpc.creational.factory.abs;

import org.sm.dpc.creational.factory.color.Color;
import org.sm.dpc.creational.factory.shape.Shape;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
