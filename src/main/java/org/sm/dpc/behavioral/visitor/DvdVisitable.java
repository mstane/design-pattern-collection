package org.sm.dpc.behavioral.visitor;

public class DvdVisitable implements Visitable {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return 10;
	}

	public double getWeight() {
		return 0.2;
	}

}
