package org.lld.patterns.factory;

public class Server extends Computer {
    private String CPU;
    private String RAM;
    private String HDD;

    public Server(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }
}
