package org.sm.dpc.structural.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		// 8. Client has the responsibility to compose desired configurations
		Widget aWidget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
		aWidget.draw();
	}
}