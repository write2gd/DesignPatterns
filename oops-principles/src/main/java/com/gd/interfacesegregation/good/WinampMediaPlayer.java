package com.gd.interfacesegregation.good;

/**
 *  
 *  So Winamp Media player only implements Audio Media Player. 
 *
 */
public class WinampMediaPlayer implements BaseAudioPlayer {

	@Override
	public void playAudio() {
		System.out.println(" Playing audio........");
		
	}

}
