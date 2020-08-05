package com.balajikatika.patterns.adapter;

import com.balajikatika.constants.Constants;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;

	public AudioPlayer() {
		mediaAdapter = new MediaAdapter();
	}

	public void play(String audioType) {
		if (audioType.equals(Constants.CONST_REGULAR)) {
			System.out.println("Regular Play");
		} else {
			mediaAdapter.play(audioType);
		}
	}

}
