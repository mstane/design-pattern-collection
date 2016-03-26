package org.sm.dpc.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
	
	private static final Logger logger = LoggerFactory.getLogger(Customer.class);

	private List<Double> drinks;
	private BillingStrategy strategy;

	public Customer(BillingStrategy strategy) {
		this.drinks = new ArrayList<Double>();
		this.strategy = strategy;
	}

	public void add(double price, int quantity) {
		drinks.add(strategy.getActPrice(price * quantity));
	}

	// Payment of bill
	public void printBill() {
		double sum = 0;
		for (Double i : drinks) {
			sum += i;
		}
		logger.debug("Total due: " + sum);
		drinks.clear();
	}
	
	public double getSum() {
		double sum = 0;
		for (Double i : drinks) {
			sum += i;
		}
		return sum;
	}

	// Set Strategy
	public void setStrategy(BillingStrategy strategy) {
		this.strategy = strategy;
	}

}