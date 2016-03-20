package org.sm.dpc.behavioral.visitor;

import java.util.ArrayList;

public class VisitorDemo {

	public static void main(String[] arg) {
		ArrayList<Visitable> items = new ArrayList<Visitable>();
		
		items.add(new BookVisitable());
		items.add(new CdVisitable());
		items.add(new DvdVisitable());
		
		PostageVisitor visitor = new PostageVisitor();

		for (Visitable item : items) {
			item.accept(visitor);
		}
		
		double postage = visitor.getTotalPostage();

	}

}
