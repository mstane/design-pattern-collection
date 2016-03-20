package org.sm.dpc.behavioral.visitor;

public class CdVisitable implements Visitable {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return 5;
	}

	public double getWeight() {
		return 0.1;
	}

}
