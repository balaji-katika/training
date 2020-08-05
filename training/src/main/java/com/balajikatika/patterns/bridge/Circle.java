package com.balajikatika.patterns.bridge;

public class Circle implements Picture {
	private DrawAPI api;

	public Circle(DrawAPI api) {
		this.api = api;
	}

	public void drawPicture() {
		System.out.println("Drawing circle");
		api.drawCircle();

	}

}
