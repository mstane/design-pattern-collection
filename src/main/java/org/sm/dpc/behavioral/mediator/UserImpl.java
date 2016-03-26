package org.sm.dpc.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserImpl extends User {
	
	private static final Logger logger = LoggerFactory.getLogger(UserImpl.class);

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		logger.debug(this.name + ": Sending Message=" + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		logger.debug(this.name + ": Received Message:" + msg);
	}

}