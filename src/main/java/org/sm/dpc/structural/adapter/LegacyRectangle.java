package org.sm.dpc.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyRectangle {
	
	private static final Logger logger = LoggerFactory.getLogger(LegacyRectangle.class);
	
	public void draw(int x, int y, int w, int h) {
		logger.debug("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
	}
}
