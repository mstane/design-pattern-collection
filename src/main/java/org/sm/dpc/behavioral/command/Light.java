package org.sm.dpc.behavioral.command;

/**
 * The Receiver class
 */
public class Light {

    boolean on;

    public Light() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
