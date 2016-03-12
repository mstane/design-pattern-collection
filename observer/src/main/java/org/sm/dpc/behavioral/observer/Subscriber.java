package org.sm.dpc.behavioral.observer;

public class Subscriber implements Observer {
	
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notify(String message) {
		System.out.println("Subscriber " + name + " received message: " + message);
	}

}
