package org.sm.dpc.structural.flyweight;

class Order {
	private final int tableNumber;
	private final CoffeeFlavour flavour;

	Order(int tableNumber, CoffeeFlavour flavor) {
		this.tableNumber = tableNumber;
		this.flavour = flavor;
	}

	void serve() {
		System.out.println("Serving " + flavour + " to table " + tableNumber);
	}
}
