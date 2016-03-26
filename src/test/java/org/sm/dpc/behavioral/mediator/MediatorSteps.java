package org.sm.dpc.behavioral.mediator;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.sm.dpc.behavioral.mediator.ChatMediator;
import org.sm.dpc.behavioral.mediator.ChatMediatorImpl;
import org.sm.dpc.behavioral.mediator.User;
import org.sm.dpc.behavioral.mediator.UserImpl;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(MockitoJUnitRunner.class)
public class MediatorSteps {
	
	private ChatMediator mediator;
	
	private User user1;
	private User user2;
	private User user3;
	private User user4;
	
	private String message = "Hi Everybody";
	
	@Before
	public void setUp() {
		mediator = new ChatMediatorImpl();
	}

	@Given("^a chat room$")
	public void chatRoom() throws Throwable {
        user1 = Mockito.spy(new UserImpl(mediator, "User1"));
        user2 = Mockito.spy(new UserImpl(mediator, "User2"));
        user3 = Mockito.spy(new UserImpl(mediator, "User3"));
        user4 = Mockito.spy(new UserImpl(mediator, "User4"));
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
	}

	@When("^a user sends a message$")
	public void userSendsMessage() throws Throwable {
		user1.send(message);
	}

	@Then("^all other users in the chat room receive the message$")
	public void receivingMessages()
			throws Throwable {
		Mockito.verify(user2).receive(message);
		Mockito.verify(user3).receive(message);
		Mockito.verify(user4).receive(message);
	}

	
}
