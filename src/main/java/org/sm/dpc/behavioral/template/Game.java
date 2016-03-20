package org.sm.dpc.behavioral.template;

public abstract class Game {
	
	// template method
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
	
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

}
