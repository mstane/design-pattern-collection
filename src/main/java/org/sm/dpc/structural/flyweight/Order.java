package org.sm.dpc.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Order {
	
	private static final Logger logger = LoggerFactory.getLogger(Order.class);
	
	private final int tableNumber;
	private final CoffeeFlavour flavour;

	Order(int tableNumber, CoffeeFlavour flavor) {
		this.tableNumber = tableNumber;
		this.flavour = flavor;
	}

	void serve() {
		logger.debug("Serving " + flavour + " to table " + tableNumber);
	}
}
