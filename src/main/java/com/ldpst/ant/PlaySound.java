package com.ldpst.ant;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlaySound {
    public static void main(String[] args) throws Exception {
        AudioInputStream audio = AudioSystem.getAudioInputStream(new File(args[0]));
        System.out.println("Playing " + args[0]);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength() / 1000);
    }
}