package org.sm.dpc.behavioral.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cricket extends Game {
	
	private static final Logger logger = LoggerFactory.getLogger(Cricket.class);

	@Override
	void endPlay() {
		logger.debug("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		logger.debug("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		logger.debug("Cricket Game Started. Enjoy the game!");
	}
}