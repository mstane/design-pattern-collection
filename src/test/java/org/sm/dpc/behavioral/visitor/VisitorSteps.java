package org.sm.dpc.behavioral.visitor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;

public class VisitorSteps {

    private PostageVisitor visitor;

    @Given("^postage prices$")
    public void postage_prices() throws Throwable {
        visitor = new PostageVisitor();
    }

    @When("^there are items to send$")
    public void send_items() throws Throwable {
        new BookVisitable(5, 2).accept(visitor);
        new CdVisitable().accept(visitor);
        new DvdVisitable().accept(visitor);
        new BookVisitable(20, 5).accept(visitor);
    }

    @Then("^calculate total postage$")
    public void gets_postage() throws Throwable {
        assertEquals(12.0, visitor.getTotalPostage(), 0);
    }
}
