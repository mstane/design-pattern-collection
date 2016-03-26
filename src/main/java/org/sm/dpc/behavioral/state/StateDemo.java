package org.sm.dpc.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StateDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(StateDemo.class);

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		logger.debug(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		logger.debug(context.getState().toString());
	}

}
