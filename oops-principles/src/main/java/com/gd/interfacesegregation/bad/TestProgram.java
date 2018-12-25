package com.gd.interfacesegregation.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * This is sample client program which refers BaseAudioPlayer
 */
public class TestProgram {

    public static void main(String[] args) {

        // Created list of players
        List<BasePlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        // Play video in all players
        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

        // Now adding new Winamp player
        allPlayers.add(new WinampMediaPlayer());

        // Again play video in all players & Oops it broke the program... :-(
        // Why we got unexpected behavior in client?
        // --- Because IS is violated in WinampMediaPlayer.java, as it changed the original behavior of super class BaseAudioPlayer.java
        playVideoInAllMediaPlayers(allPlayers);
    }

    /**
     * This method is playing video in all players
     *
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List<BasePlayer> allPlayers) {

        for (BasePlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
