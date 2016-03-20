package org.sm.dpc.behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VicePresidentPurchasePower extends PurchasePower {
	
	private static final Logger logger = LoggerFactory.getLogger(VicePresidentPurchasePower.class);
	
	private final double ALLOWABLE = 40 * BASE;

	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE) {
			logger.debug("Vice President will approve $" + request.getAmount());
		} else if (successor != null) {
			successor.processRequest(request);
		}
	}
}