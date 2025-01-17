package StructuralPatterns.adapterPattern.Adapter.implementation;

import StructuralPatterns.adapterPattern.Adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaPlayerAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
