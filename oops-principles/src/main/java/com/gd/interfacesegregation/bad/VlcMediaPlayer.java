package com.gd.interfacesegregation.bad;

/**
 * VLC Media player  implements Media player.
 */
public class VlcMediaPlayer implements BasePlayer {
    public void playAudio() {
        System.out.println(" Playing audio ..........");

    }

    public void playVideo() {
        System.out.println(" Playing video ..........");

    }
}