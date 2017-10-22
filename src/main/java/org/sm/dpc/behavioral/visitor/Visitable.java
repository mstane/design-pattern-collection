package org.sm.dpc.behavioral.visitor;

interface Visitable {
	void accept(Visitor visitor);
}