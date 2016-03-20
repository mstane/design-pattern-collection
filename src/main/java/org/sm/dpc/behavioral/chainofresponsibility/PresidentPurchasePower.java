package org.sm.dpc.behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PresidentPurchasePower extends PurchasePower {
	
	private static final Logger logger = LoggerFactory.getLogger(PresidentPurchasePower.class);
	
    private final double ALLOWABLE = 60 * BASE;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
        	logger.debug("President will approve $" + request.getAmount());
        } else {
        	logger.debug( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}
