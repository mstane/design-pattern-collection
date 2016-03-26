package org.sm.dpc.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopState implements State {
	
	private static final Logger logger = LoggerFactory.getLogger(StopState.class);

	public void doAction(Context context) {
		logger.debug("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}