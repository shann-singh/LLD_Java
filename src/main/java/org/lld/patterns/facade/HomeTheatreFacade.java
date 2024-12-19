package org.lld.patterns.facade;

public class HomeTheatreFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Lights lights;
    private Projector projector;

    public HomeTheatreFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Lights lights, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.lights = lights;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing Home theatre to watch movie");
        this.lights.dim(10);
        this.projector.start();
        this.projector.setMode("Wide Screen");
        this.amplifier.start();
        this.amplifier.setVolume(80);
        this.dvdPlayer.start();
        this.dvdPlayer.play(movie);
        System.out.println("Enjoy your movie");
    }

    public void endMovie() {
        System.out.println("Shutting down Home theatre");
        this.projector.stop();
        this.amplifier.stop();
        this.dvdPlayer.stop();
        this.lights.dim(80);
        System.out.println("Home theatre is off");
    }
}
