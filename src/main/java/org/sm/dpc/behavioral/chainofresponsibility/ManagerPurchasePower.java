package org.sm.dpc.behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManagerPurchasePower extends PurchasePower {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerPurchasePower.class);
	
	private final double ALLOWABLE = 10 * BASE;

	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE) {
			logger.debug("Manager will approve $" + request.getAmount());
		} else if (successor != null) {
			successor.processRequest(request);
		}
	}
}
