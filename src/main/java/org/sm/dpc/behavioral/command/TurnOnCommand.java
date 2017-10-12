package org.sm.dpc.behavioral.command;

public class TurnOnCommand implements Command {
    private Light myLight;

    public TurnOnCommand(Light myLight) {
        this.myLight = myLight;
    }

    @Override
    public void apply() {
        myLight.setOn(true);
    }
}
