package com.gd.liskovssubstitution.good;

import java.util.ArrayList;
import java.util.List;

/**
 * This is sample client program which refers BasePlayer
 * 
 */
public class TestProgram {

	public static void main(String[] args) {		

		List<VideoPlayer> allPlayers = new ArrayList<VideoPlayer>();
		allPlayers.add(new VlcMediaPlayer());
		allPlayers.add(new DivMediaPlayer());
		
		playVideoInAllMediaPlayers(allPlayers);
		
		System.out.println("---------------------------");
		
		// Now adding new Winamp player. If you uncomment below line, it would give compile time error as can't add audio player in list of video players.
		// allPlayers.add(new AudioPlayer());
	}

	/**
	 * This method is playing video in all players
	 * 
	 * @param allPlayers
	 */
	public static void playVideoInAllMediaPlayers(List<VideoPlayer> allPlayers) {
		
		for(VideoPlayer player : allPlayers) {
			player.playVideo();
		}
	}
}
