package com.balajikatika.patterns.adapter;

import javax.activity.InvalidActivityException;


public class Mp4AudioPlayer implements AdvancedMediaPlayer {

	public void playMp4() {
		System.out.println("I can play MP4");

	}

	public void playMp5() {
		new InvalidActivityException();
	}

}
