package com.balajikatika.patterns.adapter;

public class AdapterPatternMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("regular");
		audioPlayer.play("mp4");
		audioPlayer.play("mp5");
		audioPlayer.play("invalid");

	}

}
