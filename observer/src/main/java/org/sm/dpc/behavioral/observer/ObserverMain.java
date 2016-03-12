package org.sm.dpc.behavioral.observer;

public class ObserverMain {
	
	public static void main(String[] args) {
		Observable publisher = new Publisher();
		
		Observer subscriber1 = new Subscriber("First");
		Observer subscriber2 = new Subscriber("Second");
		Observer subscriber3 = new Subscriber("Third");
		
		publisher.registerObserver(subscriber1);
		publisher.registerObserver(subscriber2);
		publisher.registerObserver(subscriber3);
		
		String message = "Hello everyone!";
		System.out.println("Published message: " + message);
		publisher.notifyObservers(message);
	}

}
