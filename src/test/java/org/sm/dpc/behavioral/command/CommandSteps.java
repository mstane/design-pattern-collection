package org.sm.dpc.behavioral.command;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CommandSteps {

    private static final String ON_STATUS = "on";

    private Light light;
    private Switch mySwitch;

    @Before
    public void setUp() {
        light = new Light();
    }

    @Given("^light switcher$")
    public void initialiseLight() throws Throwable {
        mySwitch = new Switch();
    }

    @When("^the switcher is (on|off)$")
    public void switchLights(String currentState) throws Throwable {
        if (currentState.equals(ON_STATUS)) {
            mySwitch.execute(new TurnOffCommand(light));
        } else {
            mySwitch.execute(new TurnOnCommand(light));
        }
    }

    @Then("^it should change the state in (on|off)$")
    public void checkState(String finalState) throws Throwable {
        assertEquals(finalState.equals(ON_STATUS), light.isOn());
    }
}
