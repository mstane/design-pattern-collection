package org.sm.dpc.behavioral.strategy.steps;

import static org.junit.Assert.assertEquals;

import org.sm.dpc.behavioral.strategy.BillingStrategy;
import org.sm.dpc.behavioral.strategy.Customer;
import org.sm.dpc.behavioral.strategy.HappyHourStrategy;
import org.sm.dpc.behavioral.strategy.NormalStrategy;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StrategySteps {

	private Customer customer;
	private NormalStrategy normalStrategy;
	private HappyHourStrategy happyHourStrategy;

	private BillingStrategy getBillingStrategy(String typeOfTime) {
		if ("happy hour".equals(typeOfTime)) {
			return happyHourStrategy;
		} else {
			return normalStrategy;
		}
	}
	
	@Before
	public void setUp() {
		normalStrategy = new NormalStrategy();
		happyHourStrategy = new HappyHourStrategy();
		customer = new Customer(normalStrategy);
	}

	@Given("^customer in \"([^\"]*)\" time$")
	public void customerInTime(String typeOfTime) throws Throwable {
		customer.setStrategy(getBillingStrategy(typeOfTime));
	}

	@When("^order (\\d+) drinks of price of \\$(\\d+\\.\\d+)$")
	public void orderDrinks(int numberOfDrinks, double price) throws Throwable {
		customer.add(price, numberOfDrinks);
	}

	@Then("^it will be added to the bill$")
	public void addedToBill()
			throws Throwable {
	}
	
	@Then("^gets bill$")
	public void getsBill() throws Throwable {
		assertEquals(2.0, customer.getSum(), 0);
	}

	
}
