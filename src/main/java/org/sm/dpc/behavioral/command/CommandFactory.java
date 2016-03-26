package org.sm.dpc.behavioral.command;

import java.util.HashMap;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sm.dpc.behavioral.observer.Publisher;

public final class CommandFactory {
	
	private static final Logger logger = LoggerFactory.getLogger(Publisher.class);
	
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
		logger.debug("Enabled commands: " + commands.keySet().stream().collect(Collectors.joining(", ")));
	}
	
	/* Factory pattern */
	public static CommandFactory init() {
		CommandFactory cf = new CommandFactory();

		// commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
		cf.addCommand("Light on", () -> logger.debug("Light turned on"));
		cf.addCommand("Light off", () -> logger.debug("Light turned off"));

		return cf;
	}
}


