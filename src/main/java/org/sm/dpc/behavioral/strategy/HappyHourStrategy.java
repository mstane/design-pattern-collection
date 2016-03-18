package org.sm.dpc.behavioral.strategy;

public class HappyHourStrategy implements BillingStrategy {

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice * 0.5;
	}

}
