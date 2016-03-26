package org.sm.dpc.creational.builder;

import static org.junit.Assert.assertNotNull;

import java.awt.Color;
import java.awt.Point;

import org.sm.dpc.creational.builder.StreetMap;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BuilderSteps {

	private StreetMap map;
	
	@Before
	public void setUp() {
	}

	@Given("^parameters for the route and map view$")
	public void parameters() throws Throwable {
		map = new StreetMap.Builder(new Point(50, 50), new Point(100, 100))
		.landColor(Color.GRAY)
		.waterColor(Color.BLUE.brighter()).build();
	}

	@Then("^it will produce object with data$")
	public void producedObject() throws Throwable {
		assertNotNull(map);
	}
}
