package com.balajikatika.patterns.adapter;

import javax.activity.InvalidActivityException;


public class Mp5AudioPlayer implements AdvancedMediaPlayer {

	public void playMp4() {
		new InvalidActivityException();

	}

	public void playMp5() {
		System.out.println("I can play MP5");
	}

}
