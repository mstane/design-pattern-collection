package org.sm.dpc.structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();

	}
}
