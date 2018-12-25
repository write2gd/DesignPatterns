package com.gd.liskovssubstitution.bad;

import java.util.ArrayList;
import java.util.List;

public class TestProgram {

    public static void main(String[] args) {

        List<BasePlayer> allPlayers = new ArrayList<BasePlayer>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

        // add new Audio player
        allPlayers.add(new AudioPlayer());

        /* Again play video in all players & Oops it broke the program... :-(
         Why we got unexpected behavior in client?
         Because LSP is violated in AudioPlayer.java, as it changed the original behavior of super class BasePlayer.java*/
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
