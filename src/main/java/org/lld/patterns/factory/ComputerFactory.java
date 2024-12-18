package org.lld.patterns.factory;

public class ComputerFactory {

    static public Computer getComputer(String type, String CPU, String RAM, String HDD) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(CPU, RAM, HDD);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(CPU, RAM, HDD);
        } else {
            return null;
        }
    }
}
