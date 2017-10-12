package org.sm.dpc.behavioral.command;

public class TurnOffCommand implements Command {
    private Light myLight;

    public TurnOffCommand(Light myLight) {
        this.myLight = myLight;
    }

    @Override
    public void apply() {
        myLight.setOn(false);
    }
}
