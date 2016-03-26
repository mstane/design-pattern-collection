package org.sm.dpc.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Football extends Game {
	
	private static final Logger logger = LoggerFactory.getLogger(Football.class);

	@Override
	void endPlay() {
		logger.debug("Football Game Finished!");
	}

	@Override
	void initialize() {
		logger.debug("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		logger.debug("Football Game Started. Enjoy the game!");
	}
}
