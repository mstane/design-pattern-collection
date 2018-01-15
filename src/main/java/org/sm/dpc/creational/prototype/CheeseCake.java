package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheeseCake extends Cake {

    private static final Logger logger = LoggerFactory.getLogger(CheeseCake.class);
    private int cheese;

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    @Override
    public void bakeCake(){ logger.debug("Bake the cheesecake.");}

}
