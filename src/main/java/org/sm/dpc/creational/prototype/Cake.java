package org.sm.dpc.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Cake implements Cloneable {

    private static final Logger logger = LoggerFactory.getLogger(Cake.class);
    private int sugar;
    private int butter;
    private int flour;

    abstract void bakeCake();

    public int getSugar() { return sugar; }

    public void setSugar(int sugar) { this.sugar = sugar; }

    public int getButter() {
        return butter;
    }

    public void setButter(int butter) {
        this.butter = butter;
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    @Override
    public Object clone() {
        Cake clone = null;

        try {
            clone = (Cake) super.clone();

        } catch (CloneNotSupportedException e) {
            logger.error("", e);
        }

        return clone;
    }

}
