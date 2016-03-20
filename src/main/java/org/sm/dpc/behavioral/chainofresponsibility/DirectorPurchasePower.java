package org.sm.dpc.behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirectorPurchasePower extends PurchasePower {
	
	private static final Logger logger = LoggerFactory.getLogger(DirectorPurchasePower.class);
	
	private final double ALLOWABLE = 20 * BASE;

	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE) {
			logger.debug("Director will approve $" + request.getAmount());
		} else if (successor != null) {
			successor.processRequest(request);
		}
	}
}
