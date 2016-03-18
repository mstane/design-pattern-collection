package org.sm.dpc.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {

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
		System.out.println("Total due: " + sum);
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