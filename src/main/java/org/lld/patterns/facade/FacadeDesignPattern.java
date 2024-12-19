package org.lld.patterns.facade;

public class FacadeDesignPattern {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, amplifier, lights, projector);

        String movieName = "Mission Impossible 4";
        homeTheatreFacade.watchMovie(movieName);
        System.out.println();
        homeTheatreFacade.endMovie();
    }
}
