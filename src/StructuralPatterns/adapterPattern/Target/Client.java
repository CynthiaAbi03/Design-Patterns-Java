package StructuralPatterns.adapterPattern.Target;

import StructuralPatterns.adapterPattern.Adapter.implementation.AudioPlayer;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "far far away.mp4");
        audioPlayer.play("vlc", "mind me.vlc");
        audioPlayer.play("avi", "movie.avi");
    }
}
