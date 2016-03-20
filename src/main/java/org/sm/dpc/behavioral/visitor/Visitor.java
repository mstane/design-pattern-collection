package org.sm.dpc.behavioral.visitor;

public interface Visitor {
	
	public void visit(BookVisitable item);

	public void visit(CdVisitable item);

	public void visit(DvdVisitable itme);
	
}