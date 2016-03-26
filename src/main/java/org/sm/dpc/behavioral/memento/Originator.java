package org.sm.dpc.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Originator {
	
	private static final Logger logger = LoggerFactory.getLogger(Originator.class);
	
	private String state;
	/*
	 * lots of memory consumptive private data that is not necessary to define
	 * the state and should thus not be saved. Hence the small memento object.
	 */

	public void set(String state) {
		logger.debug("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		logger.debug("Originator: Saving to Memento.");
		return new Memento(state);
	}

	public void restoreFromMemento(Memento m) {
		state = m.getSavedState();
		logger.debug("Originator: State after restoring from Memento: " + state);
	}
}
