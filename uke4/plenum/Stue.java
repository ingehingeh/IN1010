// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)

import java.util.List;
import java.util.LinkedList; // enklere datastruktur enn ArrayList

public class Stue extends Rom {
    // bruk private når ikke skal ha noe dypere subklasse
    private boolean harPeis;

    public Stue(int kvadratMeter, int etasje, boolean harPeis) {
        super(kvadratMeter, etasje); // kaller på konstruktør til superklassen
        this.harPeis = harPeis;
    }

    @Override
    public String typeRom() {
        return "Stue";
    }

    @Override
    public List<String> hentKvaliteter(){
        List<String> kvaliteter = new LinkedList<>();

        if (harPeis){
            kvaliteter.add("Rommet har peis");
        }
        return kvaliteter;
    }

}
