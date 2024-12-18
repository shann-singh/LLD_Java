package org.lld.patterns.factory;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "CPU: " + getCPU() + ", RAM: " + getRAM() + ", HDD: " + getHDD();
    }
}
