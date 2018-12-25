package com.gd.liskovssubstitution.bad;

/**
 *  Now there is a need of launching new Audio player to play audio, but playing video is not supported at this stage.
 *  
 *  Oops... LSP is violated here! Why? Logically Audio player only supports playing audio. So what's wrong in overriding playVideo method of super class?
 *
 *  Well, see how it broke the client program (TestProgram.java)
 *
 */
public class AudioPlayer extends BasePlayer {

	// Play video is not supported in Audio player
	public void playVideo() {
		throw new VideoUnsupportedException();
	}
}
