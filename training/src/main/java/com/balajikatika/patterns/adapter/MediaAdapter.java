package com.balajikatika.patterns.adapter;

import com.balajikatika.constants.Constants;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer mp4Player;
	private AdvancedMediaPlayer mp5Player;

	public MediaAdapter() {
		mp4Player = new Mp4AudioPlayer();
		mp5Player = new Mp5AudioPlayer();
	}

	public void play(String audioType) {

		if (audioType.equals(Constants.CONST_MP4)) {
			mp4Player.playMp4();
		} else if (audioType.equals(Constants.CONST_MP5)) {
			mp5Player.playMp5();
		} else {
			System.out.println("I can't support this format");
		}
	}
}
