package org.sm.dpc.behavioral.observer;

public interface Observer {
	
	public void notify(String message);

	public Object getMessage();

}
