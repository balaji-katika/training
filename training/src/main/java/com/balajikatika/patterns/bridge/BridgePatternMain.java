package com.balajikatika.patterns.bridge;

public class BridgePatternMain {

	public static void main(String[] args) {
		Picture picture = new Circle(new GreenCircle());
		picture.drawPicture();
		picture = new Circle(new RedCircle());
		picture.drawPicture();
	}
}