package com.gd.interfacesegregation.good;

/**
 * VLC Media player implements both Video Media Player and Audio Media Player.
 */
public class VlcMediaPlayer implements BaseVideoPlayer, BaseAudioPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");
		
	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");
		
	}

}