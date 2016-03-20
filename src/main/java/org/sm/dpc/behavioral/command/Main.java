package org.sm.dpc.behavioral.command;

public final class Main {
	public static void main(String[] args) {
		CommandFactory cf = CommandFactory.init();
		cf.executeCommand("Light on");
		cf.listCommands();
	}
}
