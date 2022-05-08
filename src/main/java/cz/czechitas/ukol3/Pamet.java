package cz.czechitas.ukol3;
public class Pamet {

    public long ram;

    public long getRam() {
        return ram;
    }
    public void setRam (long ram) {
        this.ram = ram;
    }

    @Override
    public String toString(){
        return "Pamet kapacita: " + ram + " bajtu";
    }

}

