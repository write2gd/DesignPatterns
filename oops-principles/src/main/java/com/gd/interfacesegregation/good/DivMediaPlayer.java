package com.gd.interfacesegregation.good;

/**
 * Div Media player implements both BaseVideoPlayer,BaseAudioPlayer.
 */
public class DivMediaPlayer implements BaseVideoPlayer, BaseAudioPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");

	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");

	}
}
