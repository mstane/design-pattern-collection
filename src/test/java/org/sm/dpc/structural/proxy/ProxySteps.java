package org.sm.dpc.structural.proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.mockito.Mockito;
import org.sm.dpc.structural.proxy.File;
import org.sm.dpc.structural.proxy.Proxy;
import org.sm.dpc.structural.proxy.Server;
import org.sm.dpc.util.ObjectSerializer;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProxySteps {

	private Server server;
	private Proxy proxy;
	private File testFile;
	private int numberOfAccess;
	
	@Before
	public void setUp() {
		numberOfAccess = 0;
		server = Mockito.mock(Server.class);
		
		proxy = new Proxy(server);
		
		testFile = ObjectSerializer.loadObjectFromXml("data/structural/proxy.data.xml");
	}

	@Given("^one file remotely$")
	public void oneFileRemotely() throws Throwable {
		Mockito.when(server.getFile(testFile.getName())).thenReturn(testFile);		
	}

	@When("^access file$")
	public void accessFile() throws Throwable {
		File obtainedFile = proxy.getFile(testFile.getName());
		assertEquals(testFile.getName(), obtainedFile.getName());
		assertEquals(testFile.getContent(), obtainedFile.getContent());
	}

	@Then("^it should be accessed \"([^\"]*)\"$")
	public void itShouldBeAccessed(String location) throws Throwable {
		if ("locally".equals(location)) {
			
		} else if ("remotely".equals(location)) {
			numberOfAccess++;
		} else {
			fail();
		}
		Mockito.verify(server, Mockito.times(numberOfAccess)).getFile(testFile.getName());
	}
}
