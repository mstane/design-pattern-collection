package org.sm.dpc.behavioral.command;

/**
 * The Invoker class
 */
public class Switch {
    public void execute(final Command cmd) {
        cmd.apply();
    }
}
