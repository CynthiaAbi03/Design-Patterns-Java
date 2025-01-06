package StructuralPatterns.adapterPattern.Adaptee.implementation;

import StructuralPatterns.adapterPattern.Adaptee.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
