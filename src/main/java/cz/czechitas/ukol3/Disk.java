package cz.czechitas.ukol3;
public class Disk {

    public Long pevnyDiskKapacita;
    public Long vyuziteMistoPevnyDisk;

    public Long getVyuziteMistoPevnyDisk() {
        return vyuziteMistoPevnyDisk;
    }

    public void setVyuziteMistoPevnyDisk(Long vyuziteMistoPevnyDisk) {
        this.vyuziteMistoPevnyDisk = vyuziteMistoPevnyDisk;
    }


    public Long getPevnyDiskKapacita() {
        return pevnyDiskKapacita;
    }

    public void setPevnyDiskKapacita(Long pevnyDiskKapacita) {
        this.pevnyDiskKapacita = pevnyDiskKapacita;
    }


    @Override
    public String toString() {
        return "Kapacita disku: " + pevnyDiskKapacita + " bajtu, " + "Vyuzite misto na disku: " + vyuziteMistoPevnyDisk + " bajtu";
    }
}


