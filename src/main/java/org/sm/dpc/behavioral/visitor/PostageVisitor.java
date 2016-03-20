package org.sm.dpc.behavioral.visitor;

public class PostageVisitor implements Visitor {
	private double totalPostageForCart;

	public void visit(BookVisitable book) {
		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		}
	}

	public void visit(CdVisitable cd) {
		
	}

	public void visit(DvdVisitable dvd) {
		
	}

	public double getTotalPostage() {
		return totalPostageForCart;
	}
	
}
