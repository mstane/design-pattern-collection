package org.sm.dpc.creational.singleton;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class SingletonSteps {

    private SingletonClass singletonOne;
    private SingletonClass singletonTwo;

    @Before
    public void setUp() {
    }

    @Given("^guardian of the instance$")
    public void guardian_of_the_instance() throws Throwable {
    }

    @When("^ask for an instance$")
    public void get_instance() throws Throwable {
        singletonOne = SingletonClass.getInstance();
        singletonTwo = SingletonClass.getInstance();
    }

    @Then("^it will always retrieve the same instance$")
    public void test_unique() throws Throwable {
        assertTrue(singletonOne == singletonTwo);
    }
}
