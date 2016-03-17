package org.sm.dpc.behavioral.observer;

import javax.annotation.Nonnull;

public interface Observable {
	
	public void registerObserver(@Nonnull Observer observer);
	
	public void unregisterObserver(@Nonnull Observer observer);
	
	public void notifyObservers(String message);

}
