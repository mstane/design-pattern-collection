package org.sm.dpc.behavioral.observer;

public interface Observable {
	
	public void registerObserver(Observer observer);
	
	public void unregisterObserver(Observer observer);
	
	public void notifyObservers(String message);

}
