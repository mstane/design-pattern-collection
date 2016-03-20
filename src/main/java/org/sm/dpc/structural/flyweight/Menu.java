package org.sm.dpc.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Menu acts as a factory and cache for CoffeeFlavour flyweight objects
class Menu {
	private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

	CoffeeFlavour lookup(String flavorName) {
		if (!flavours.containsKey(flavorName))
			flavours.put(flavorName, new CoffeeFlavour(flavorName));
		return flavours.get(flavorName);
	}

	int totalCoffeeFlavoursMade() {
		return flavours.size();
	}
}