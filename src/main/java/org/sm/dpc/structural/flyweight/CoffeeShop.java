package org.sm.dpc.structural.flyweight;

import java.util.List;
import java.util.Vector;

public class CoffeeShop {
	private final List<Order> orders = new Vector<Order>();
	private final Menu menu = new Menu();

	void takeOrder(String flavourName, int table) {
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table, flavour);
		orders.add(order);
	}

	void service() {
		for (Order order : orders)
			order.serve();
	}

	String report() {
		return "\ntotal CoffeeFlavour objects made: " + menu.totalCoffeeFlavoursMade();
	}
}
