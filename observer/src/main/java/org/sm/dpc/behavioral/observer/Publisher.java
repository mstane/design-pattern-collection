package org.sm.dpc.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable {

	private List<Observer> observers;
	
	public Publisher() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		for (Observer observer : this.observers) {
			observer.notify(message);
		}
	}

}
