package org.lld.patterns.facade;

public class Projector {
    public void start() {
        System.out.println("Projector is ON");
    }
    public void setMode(String mode) {
        System.out.println("Projector mode set to:" + mode);
    }
    public void stop() {
        System.out.println("Amplifier is OFF");
    }
}
