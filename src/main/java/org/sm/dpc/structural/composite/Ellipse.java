package org.sm.dpc.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public/** "Leaf" */
class Ellipse implements Graphic {
	
	private static final Logger logger = LoggerFactory.getLogger(Ellipse.class);

    //Prints the graphic.
    public void print() {
        logger.debug("Ellipse");
    }
}
