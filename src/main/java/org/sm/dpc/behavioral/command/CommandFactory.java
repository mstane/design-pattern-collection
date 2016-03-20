package org.sm.dpc.behavioral.command;

import java.util.HashMap;
import java.util.stream.Collectors;

public final class CommandFactory {
	private final HashMap<String, Command>	commands;
	
	private CommandFactory() {
		commands = new HashMap<>();
	}

	public void addCommand(String name, Command command) {
		commands.put(name, command);
	}
	
	public void executeCommand(String name) {
		if (commands.containsKey(name)) {
			commands.get(name).apply();
		}
	}

	public void listCommands() {
		System.out.println("Enabled commands: " + commands.keySet().stream().collect(Collectors.joining(", ")));
	}
	
	/* Factory pattern */
	public static CommandFactory init() {
		CommandFactory cf = new CommandFactory();

		// commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
		cf.addCommand("Light on", () -> System.out.println("Light turned on"));
		cf.addCommand("Light off", () -> System.out.println("Light turned off"));

		return cf;
	}
}


