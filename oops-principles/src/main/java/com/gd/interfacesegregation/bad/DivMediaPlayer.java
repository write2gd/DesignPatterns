package com.gd.interfacesegregation.bad;

/**
 * Div Media player implements Media player. Perfect,
 */
public class DivMediaPlayer implements BasePlayer {

    public void playAudio() {
        System.out.println(" Playing audio ..........");

    }

    public void playVideo() {
        System.out.println(" Playing video ..........");

    }

}
