package org.sm.dpc.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TextField implements Widget {
	
	private static final Logger logger = LoggerFactory.getLogger(TextField.class);
	
	private int width, height;

	public TextField(int w, int h) {
		width = w;
		height = h;
	}

	public void draw() {
		logger.debug("TextField: " + width + ", " + height);
	}
}