package org.sm.dpc.behavioral.observer.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.IntStream;

import org.sm.dpc.behavioral.observer.Observable;
import org.sm.dpc.behavioral.observer.Observer;
import org.sm.dpc.behavioral.observer.Publisher;
import org.sm.dpc.behavioral.observer.Subscriber;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ObserverSteps {

	private Observable publisher;
	private int numberOfUsers;
	private String message;

	@Before
	public void setUp() {
		publisher = new Publisher();
	}

	@Given("^(\\d+) subscribed users$")
	public void subscribed_users(int numberOfUsers) throws Throwable {
		this.numberOfUsers = numberOfUsers;
		IntStream.range(0, numberOfUsers).forEach(
				i -> publisher.registerObserver(new Subscriber("User" + i))
				);
		assertEquals(numberOfUsers, publisher.getSubscribers().size());
	}

	@When("^publish a message \"([^\"]*)\"")
	public void publish_message(String message) throws Throwable {
		this.message = message;
		publisher.notifyObservers(message);
	}

	@Then("^all subscribed users will receive the message$")
	public void all_subscribed_users_will_receive_the_message()
			throws Throwable {
		List<Observer> subscribers = publisher.getSubscribers();
		assertEquals(numberOfUsers, subscribers.size());
		subscribers.forEach(
				subscriber -> assertEquals(message, subscriber.getMessage())
				);
	}
}
