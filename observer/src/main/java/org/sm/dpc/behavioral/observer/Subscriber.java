package org.sm.dpc.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Subscriber implements Observer {
	
	private static final Logger logger = LoggerFactory.getLogger(Subscriber.class);
	
	private String name;
	
	private String message;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notify(String message) {
		this.message = message;
		logger.debug("Observer " + name + " received message: " + message);
	}

	public Object getMessage() {
		return message;
	}

}
