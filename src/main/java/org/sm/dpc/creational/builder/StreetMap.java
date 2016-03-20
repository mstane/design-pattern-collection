package org.sm.dpc.creational.builder;

import java.awt.Color;
import java.awt.Point;

public class StreetMap {
	private final Point origin;
	private final Point destination;

	private final Color waterColor;
	private final Color landColor;
	private final Color highTrafficColor;
	private final Color mediumTrafficColor;
	private final Color lowTrafficColor;

	public static class Builder {
		// Required parameters
		private final Point origin;
		private final Point destination;

		// Optional parameters - initialize with default values
		private Color waterColor = Color.BLUE;
		private Color landColor = new Color(30, 30, 30);
		private Color highTrafficColor = Color.RED;
		private Color mediumTrafficColor = Color.YELLOW;
		private Color lowTrafficColor = Color.GREEN;

		public Builder(Point origin, Point destination) {
			this.origin = origin;
			this.destination = destination;
		}

		public Builder waterColor(Color color) {
			waterColor = color;
			return this;
		}

		public Builder landColor(Color color) {
			landColor = color;
			return this;
		}

		public Builder highTrafficColor(Color color) {
			highTrafficColor = color;
			return this;
		}

		public Builder mediumTrafficColor(Color color) {
			mediumTrafficColor = color;
			return this;
		}

		public Builder lowTrafficColor(Color color) {
			lowTrafficColor = color;
			return this;
		}

		public StreetMap build() {
			return new StreetMap(this);
		}

	}

	private StreetMap(Builder builder) {
		// Required parameters
		origin = builder.origin;
		destination = builder.destination;

		// Optional parameters
		waterColor = builder.waterColor;
		landColor = builder.landColor;
		highTrafficColor = builder.highTrafficColor;
		mediumTrafficColor = builder.mediumTrafficColor;
		lowTrafficColor = builder.lowTrafficColor;
	}

	public Point getOrigin() {
		return origin;
	}

	public Point getDestination() {
		return destination;
	}

	public Color getWaterColor() {
		return waterColor;
	}

	public Color getLandColor() {
		return landColor;
	}

	public Color getHighTrafficColor() {
		return highTrafficColor;
	}

	public Color getMediumTrafficColor() {
		return mediumTrafficColor;
	}

	public Color getLowTrafficColor() {
		return lowTrafficColor;
	}

	
}
