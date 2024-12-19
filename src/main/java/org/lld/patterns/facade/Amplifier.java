package org.lld.patterns.facade;

public class Amplifier {
    public void start() {
        System.out.println("Amplifier is ON");
    }
    public void setVolume(int volume) {
        System.out.println("Volume:" + volume);
    }
    public void stop() {
        System.out.println("Amplifier is OFF");
    }
}
