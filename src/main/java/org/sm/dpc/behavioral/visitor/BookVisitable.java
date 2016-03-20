package org.sm.dpc.behavioral.visitor;

public class BookVisitable implements Visitable {

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return 15;
	}

	public double getWeight() {
		return 1.65;
	}
	
}
