package org.lld.patterns.factory;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2.4 GHz", "8 GB", "512 GB");
        Computer server = ComputerFactory.getComputer("Server", "3.8 GHz", "32 GB", "2048 GB");
        System.out.println("PC configuration: " + pc);
        System.out.println("Server configuration: " + server);
    }
}
