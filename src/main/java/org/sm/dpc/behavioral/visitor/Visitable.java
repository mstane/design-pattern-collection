package org.sm.dpc.behavioral.visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}