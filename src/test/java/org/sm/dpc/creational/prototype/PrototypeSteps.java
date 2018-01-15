package org.sm.dpc.creational.prototype;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class PrototypeSteps {

    private CheeseCake cheeseCake;
    private CheeseCake newCheeseCake;
    private ChocolateCake chocolateCake;
    private ChocolateCake newChocolateCake;

    @Before
    public void setUp() {
        /* Cheese cake preparation */
        cheeseCake = new CheeseCake();
        cheeseCake.setSugar(100);
        cheeseCake.setFlour(300);
        cheeseCake.setButter(150);
        cheeseCake.setCheese(50);

        /* Chocolate cake preparation */
        chocolateCake = new ChocolateCake();
        chocolateCake.setSugar(200);
        chocolateCake.setFlour(1000);
        chocolateCake.setButter(250);
        chocolateCake.setChocolate(200);
    }

    @Given("^all sorts of cakes$")
    public void bake_cake() throws Throwable {
        cheeseCake.bakeCake();
        chocolateCake.bakeCake();
    }

    @When("^chose the cake$")
    public void get_instance() throws Throwable {
        newCheeseCake = (CheeseCake) cheeseCake.clone();
        newChocolateCake = (ChocolateCake) chocolateCake.clone();
    }

    @Then("^it is made using the same recipe$")
    public void test_clone() throws Throwable {

        //ingredients and taste remains the same
        assertTrue(cheeseCake.getSugar() == newCheeseCake.getSugar());
        assertTrue(cheeseCake.getFlour() == newCheeseCake.getFlour());
        assertTrue(cheeseCake.getButter() == newCheeseCake.getButter());
        assertTrue(cheeseCake.getCheese() == newCheeseCake.getCheese());

        //these objects are different
        assertTrue(cheeseCake != newCheeseCake);

        //ingredients and taste remains the same
        assertTrue(chocolateCake.getSugar() == newChocolateCake.getSugar());
        assertTrue(chocolateCake.getFlour() == newChocolateCake.getFlour());
        assertTrue(chocolateCake.getButter() == newChocolateCake.getButter());
        assertTrue(chocolateCake.getChocolate() == newChocolateCake.getChocolate());

        //these objects are different
        assertTrue(chocolateCake != newChocolateCake);
    }
}