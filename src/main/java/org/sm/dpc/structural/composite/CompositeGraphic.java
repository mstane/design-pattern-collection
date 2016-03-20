package org.sm.dpc.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

	// Collection of child graphics.
	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	// Prints the graphic.
	public void print() {
		for (Graphic graphic : childGraphics) {
			graphic.print();
		}
	}

	// Adds the graphic to the composition.
	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	// Removes the graphic from the composition.
	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
}
