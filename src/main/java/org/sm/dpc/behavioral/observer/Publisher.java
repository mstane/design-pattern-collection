package org.sm.dpc.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Publisher implements Observable {
	
	private static final Logger logger = LoggerFactory.getLogger(Publisher.class);

	private List<Observer> observers;
	
	public Publisher() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(@Nonnull Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(@Nonnull Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		logger.debug("Publishing message: " + message);
		this.observers.forEach(observer -> observer.notify(message));
	}

}
