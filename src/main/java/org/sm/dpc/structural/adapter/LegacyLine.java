package org.sm.dpc.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyLine {
	
	private static final Logger logger = LoggerFactory.getLogger(LegacyLine.class);
	
	public void draw(int x1, int y1, int x2, int y2) {
		logger.debug("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
	}
}
