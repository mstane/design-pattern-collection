package org.sm.dpc.structural.adapter;

public class Rectangle implements Shape {
	private LegacyRectangle adaptee = new LegacyRectangle();

	public void draw(int x1, int y1, int x2, int y2) {
		adaptee.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
	}
}
