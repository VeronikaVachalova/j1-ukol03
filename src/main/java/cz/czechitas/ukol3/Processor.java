package cz.czechitas.ukol3;

public class Processor {

    public String cpuTyp;
    public String cpuRychlost;

    public String getCpuTyp() {
        return cpuTyp;
    }

    public void setCpuTyp(String cpuTyp) {
        this.cpuTyp = cpuTyp;
    }

    public String getCpuRychlost() {
        return cpuRychlost;
    }

    public void setCpuRychlost(String cpuRychlost) {
        this.cpuRychlost = cpuRychlost;
    }
    @Override
    public String toString() {
        return "Typ processoru: " + cpuTyp + ", " + "Rychlost processoru: " + cpuRychlost + " Gz";
    }
}
