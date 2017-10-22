package org.sm.dpc.behavioral.visitor;

public class CdVisitable implements Visitable {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
