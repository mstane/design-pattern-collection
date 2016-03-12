package org.sm.dpc.behavioral.observer;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Stanislav Markov
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObserverTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ObserverTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void reset() {
	}

	@Test
	public void test1() throws Exception {
		Observable publisher = new Publisher();

		Observer subscriber1 = new Subscriber("First");
		Observer subscriber2 = new Subscriber("Second");
		Observer subscriber3 = new Subscriber("Third");

		publisher.registerObserver(subscriber1);
		publisher.registerObserver(subscriber2);
		publisher.registerObserver(subscriber3);

		String message = "Hello everyone!";
		logger.debug("Published message: " + message);
		publisher.notifyObservers(message);
	}

}
