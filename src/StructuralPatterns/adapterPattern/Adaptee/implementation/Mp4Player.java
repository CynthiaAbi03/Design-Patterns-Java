package StructuralPatterns.adapterPattern.Adaptee.implementation;

import StructuralPatterns.adapterPattern.Adaptee.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
