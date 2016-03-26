package org.sm.dpc.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ScrollDecorator extends Decorator {
	
	private static final Logger logger = LoggerFactory.getLogger(ScrollDecorator.class);
	
	public ScrollDecorator(Widget w) {
		super(w);
	}

	public void draw() {
		super.draw(); // 7. Delegate to base class and add extra stuff
		logger.debug("  ScrollDecorator");
	}
}