package org.sm.dpc.behavioral.observer;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.sm.dpc.behavioral.observer.Observable;
import org.sm.dpc.behavioral.observer.Observer;
import org.sm.dpc.behavioral.observer.Publisher;
import org.sm.dpc.behavioral.observer.Subscriber;
import org.sm.dpc.util.ObjectSerializer;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(PowerMockRunner.class)
public class ObserverSteps {

	private Observable publisher;
	private String message;

	@Before
	public void setUp() {
		publisher = new Publisher();
	}

	@Given("^number of subscribed users$")
	public void subscribed_users() throws Throwable {
		List<Subscriber> subscribers = ObjectSerializer.loadObjectFromXml("data/behavioral/observer.data.xml");
		subscribers.forEach(
				subscriber -> publisher.registerObserver(subscriber)
				);		
	}

	@When("^publish a message \"([^\"]*)\"")
	public void publish_message(String message) throws Throwable {
		this.message = message;
		publisher.notifyObservers(message);
	}

	@Then("^all subscribed users will receive the message$")
	public void all_subscribed_users_will_receive_the_message()
			throws Throwable {
		List<Observer> subscribers = Whitebox.getInternalState(publisher, "observers");
		subscribers.forEach(
				subscriber -> assertEquals(message, Whitebox.getInternalState(subscriber, "message"))
				);
	}
}
