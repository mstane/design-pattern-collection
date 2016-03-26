package org.sm.dpc.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartState implements State {
	
	private static final Logger logger = LoggerFactory.getLogger(StartState.class);

	public void doAction(Context context) {
		logger.debug("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}