package StructuralPatterns.adapterPattern.Adapter.implementation;

import StructuralPatterns.adapterPattern.Adaptee.AdvancedMediaPlayer;
import StructuralPatterns.adapterPattern.Adaptee.implementation.Mp4Player;
import StructuralPatterns.adapterPattern.Adaptee.implementation.VlcPlayer;
import StructuralPatterns.adapterPattern.Adapter.MediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
