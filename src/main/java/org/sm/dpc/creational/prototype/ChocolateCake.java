package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChocolateCake extends Cake{

    private static final Logger logger = LoggerFactory.getLogger(ChocolateCake.class);
    private int chocolate;

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public void bakeCake(){ logger.debug("Bake the chocolate cake.");}

}
