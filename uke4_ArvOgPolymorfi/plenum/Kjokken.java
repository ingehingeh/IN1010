// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)

import java.util.List;
import java.util.LinkedList; // enklere datastruktur enn ArrayList

public abstract class Kjokken extends RomMedVann {

    private boolean harOppvaskmaskin;

    public Kjokken(int kvadratMeter, int etasje, boolean harVarmtVann, boolean harOppvaskmaskin) {
        super(kvadratMeter, etasje, harVarmtVann);
        this.harOppvaskmaskin = harOppvaskmaskin;
    }

    @Override
    public String typeRom(){
        return "Kjokken";
    }

    @Override
    public List<String> hentKvaliteter(){
        List<String> kvaliteter = super.hentKvaliteter();

        if (harOppvaskmaskin){
            kvaliteter.add("Rommet har oppvaskmaskin");
        }
        return kvaliteter;
    }


}