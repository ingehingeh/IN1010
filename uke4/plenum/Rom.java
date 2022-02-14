// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)
/*
Rom - Sov/Stue/RomMedVann
Rom - RomMedVann - Kjøkken/Bad


*/

import java.util.List;

public abstract class Rom {
    // bruk protected når skal bruke subklasser
    // bruk private når ikke skal ha noe dypere subklasse
    protected int kvadratMeter;
    protected int etasje;

    public Rom(int kvadratMeter, int etasje) {
        this.kvadratMeter = kvadratMeter;
        this.etasje = etasje;
        System.out.println("Kjører Rom sin konstruktør");
    }

    // bruker abstract metode her, siden ikke kan definere i superklassen
    // må defineres nærmere i subklassene
    public abstract String typeRom(); 

    public abstract List<String> hentKvaliteter();

    public int hentKvardratMeter() {
        return kvadratMeter;
    }

    public int hentEtasje() {
        return etasje;
    }

    // Setter standard at rom ikke har vann
    // overskriver i subklasser der rom faktisk har vann
    public boolean harVann() {
        return false;
    }

    public String hentInfoOmRom(){
        string = "\n--Rom---";
        string += "Type rom: " + typeRom();
        string += "Kvadratmeter: " + kvadratMeter;
        string += "Etasje: " + etasje;
        string += "Har vann: " + harVann();
        string += "Kvaliteter: ";
        
        List<String> kvaliteter = hentkvaliteter();
        for (String kvalitet : kvaliteter){
            string += "* " + kvalitet;
        }
    }




}