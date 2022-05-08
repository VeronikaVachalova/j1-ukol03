package cz.czechitas.ukol3;
import cz.czechitas.ukol3.Disk;
import cz.czechitas.ukol3.Pamet;
import cz.czechitas.ukol3.Pocitac;
import cz.czechitas.ukol3.Processor;
/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Pocitac pocitac;
        Pocitac veronikaPocitac = new Pocitac();
        System.out.println(veronikaPocitac.toString());
        veronikaPocitac.zapniSe();                       // CHYBA, chybi komponenty

        Processor cpu = new Processor();
        cpu.setCpuTyp("Intel");
        cpu.setCpuRychlost("18");

        Pamet ram = new Pamet();
        ram.setRam(512_000_000_000L);

        Disk pevnyDisk = new Disk();
        pevnyDisk.setPevnyDiskKapacita(250_000_000_000L);
        pevnyDisk.setVyuziteMistoPevnyDisk(100_000_000_000L);

        veronikaPocitac.setCpu(cpu);
        veronikaPocitac.setRam(ram);
        veronikaPocitac.setPevnyDisk(pevnyDisk);

        System.out.println(veronikaPocitac.toString());  // Vypise info o pocitaci

        veronikaPocitac.zapniSe();                       // Pocitac se zapnul
        veronikaPocitac.zapniSe();                       // CHYBA, pocitac uz je zapnuty
        System.out.println(veronikaPocitac.toString());  // Vypise info o pocitaci
        veronikaPocitac.vypniSe();                       // Pocitac se vypne

        veronikaPocitac.vypniSe();                       // Nevypise nic, nic se neprovede
        veronikaPocitac.vypniSe();                       // Nevypise nic, nic se neprovede

        veronikaPocitac.zapniSe();

        veronikaPocitac.vytvorSouborOVelikosti(290_000_000_000L);
        System.out.println(veronikaPocitac);              // CHYBA, na disku neni dostatek mista

        veronikaPocitac.vypniSe();
        veronikaPocitac.vytvorSouborOVelikosti(190_000_000_000L);
        System.out.println(veronikaPocitac);               // CHYBA, pocitac je vypnuty, nedaji se delat zadne ukony


        veronikaPocitac.zapniSe();
        veronikaPocitac.vymazSouborOVelikosti(160_000_000_000L);
        System.out.println(veronikaPocitac);               // CHYBA, kapacita disku nemuze klesnout pod 0
        veronikaPocitac.vypniSe();
        veronikaPocitac.vymazSouborOVelikosti(60_000_000_000L);
        System.out.println(veronikaPocitac);                // CHYBA, pocitac je vypnuty, nedaji se delat zadne ukony
    }
}
