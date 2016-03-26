package org.sm.dpc.behavioral.chainofresponsibility;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.sm.dpc.behavioral.chainofresponsibility.DirectorPurchasePower;
import org.sm.dpc.behavioral.chainofresponsibility.ManagerPurchasePower;
import org.sm.dpc.behavioral.chainofresponsibility.PresidentPurchasePower;
import org.sm.dpc.behavioral.chainofresponsibility.PurchasePower;
import org.sm.dpc.behavioral.chainofresponsibility.PurchaseRequest;
import org.sm.dpc.behavioral.chainofresponsibility.VicePresidentPurchasePower;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(MockitoJUnitRunner.class)
public class ChainOfResponsibilitySteps {

	private PurchasePower manager;
	private PurchasePower director;
	private PurchasePower vicePresident;
	private PurchasePower president;
	
	PurchaseRequest purchaseRequest;

	@Before
	public void setUp() {

	}

	@Given("^chain of responsibilities per amount$")
	public void chainOfResponsibilities() throws Throwable {
		manager = Mockito.spy(new ManagerPurchasePower());
		director = Mockito.spy(new DirectorPurchasePower());
		vicePresident = Mockito.spy(new VicePresidentPurchasePower());
		president = Mockito.spy(new PresidentPurchasePower());
		manager.setSuccessor(director);
		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);	
	}

	@When("^there are purchases to approve$")
	public void purchasesToApprove$() throws Throwable {
		purchaseRequest = new PurchaseRequest(19000, "General");		
	}

	@Then("^it will get role who is in charge to approve$")
	public void whoIsInChargeToApprove() throws Throwable {
		manager.processRequest(purchaseRequest);
		Mockito.verify(manager).processRequest(purchaseRequest);
		Mockito.verify(director).processRequest(purchaseRequest);
		Mockito.verify(vicePresident).processRequest(purchaseRequest);
		Mockito.verify(president, Mockito.never()).processRequest(purchaseRequest);
	}
}
