package org.lld.patterns.facade;

public class DVDPlayer {
    public void start() {
        System.out.println("DVD Player is ON");
    }
    public void play(String mediaName) {
        System.out.println("Now playing:" + mediaName);
    }
    public void stop() {
        System.out.println("DVD Player is OFF");
    }
}
