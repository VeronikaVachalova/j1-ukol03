package cz.czechitas.ukol3;
public class Pocitac {

    public boolean jeZapnuty;
    public Disk pevnyDisk;
    public Processor cpu;
    public Pamet ram;

    public long velikost;

    private boolean jeZapnuty() {
        return false;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null){
            System.err.println("Pocitaci chybi jeden nebo vice komponentu");
        }
        else if (jeZapnuty) {
            System.err.println("Pocitac je jiz zapnuty");
        }
        else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul");
        }
    }

    public void vypniSe(){
        if (jeZapnuty) {
            System.out.println("Pocitac se vypnul");
            this.jeZapnuty = false;
            return;
        }
    }

    @Override
    public String toString() {
        return cpu + ", " + ram + ", " + pevnyDisk;
    }

    public long getVelikost() {
        return velikost;
    }

    public void setVelikost(long velikost) {
        this.velikost = velikost;
    }

    public void vytvorSouborOVelikosti(long velikost){
        if (!jeZapnuty) {
            System.err.println("Pocitac neni zapnuty.");
            return;
        }
        long volneMistoNaDisku = pevnyDisk.getPevnyDiskKapacita() - pevnyDisk.getVyuziteMistoPevnyDisk();
        if (volneMistoNaDisku < velikost);{
            System.out.println("Nedostatek mista na disku.");
            return;
        }
    }
    public void vymazSouborOVelikosti(long velikost){
        if (!jeZapnuty) {
            System.err.println("Pocitac neni zapnuty.");
            return;
        }
        if (pevnyDisk.getVyuziteMistoPevnyDisk() - velikost < 0);{
            System.err.println("Kapacita disku nemuze klesnout pod nulu.");
            return;

        }
    }
}
