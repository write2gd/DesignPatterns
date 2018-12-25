package com.gd.interfacesegregation.good;

import java.util.ArrayList;
import java.util.List;

/**
 * This is sample client program which refers BaseAudioPlayer
 * 
 */
public class TestProgram {

	public static void main(String[] args) {		

		// Created list of video players
		List<BaseVideoPlayer> allPlayers = new ArrayList<BaseVideoPlayer>();
		allPlayers.add(new VlcMediaPlayer());
		allPlayers.add(new DivMediaPlayer());
		
		playVideoInAllMediaPlayers(allPlayers);
		
		System.out.println("---------------------------");
		
		// Now adding new Winamp player. If you uncomment below line, it would give compile time error as can't add audio player in list of video players.
		// allPlayers.add(new WinampMediaPlayer());
	}

	/**
	 * This method is playing video in all players
	 * 
	 * @param allPlayers
	 */
	public static void playVideoInAllMediaPlayers(List<BaseVideoPlayer> allPlayers) {
		
		for(BaseVideoPlayer player : allPlayers) {
			player.playVideo();
		}
	}
}
