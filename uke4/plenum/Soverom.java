// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)

import java.util.List;
import java.util.LinkedList; // enklere datastruktur enn ArrayList

public class Soverom extends Rom {
    // bruk private når ikke skal ha noe dypere subklasse
    private boolean harInnebygdSkap;

    public Soverom(int kvadratMeter, int etasje, boolean skap) {
        super(kvadratMeter, etasje); // kaller på konstruktør til superklassen
        harInnebygdSkap = skap;
    }

    @Override
    public String typeRom() {
        return "Soverom";
    }

    @Override
    public List<String> hentKvaliteter(){
        List<String> kvaliteter = new LinkedList<>();

        if (harInnebygdSkap){
            kvaliteter.add("Har innebygs skap");
        }
        if ((! harInnebygdSkap && kvadratMeter >= 10) || (harInnebygdSkap && kvadratMeter >=15)) {
            kvaliteter.add("Har plass til dobbeltseng");
        }
        return kvaliteter;
    }



}