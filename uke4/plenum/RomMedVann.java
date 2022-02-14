// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)

import java.util.List;
import java.util.LinkedList; // enklere datastruktur enn ArrayList

public abstract class RomMedVann extends Rom {

    protected boolean harVarmtVann;

    public Rom MedVann(int kvadratMeter, int etasje, boolean harVarmtVann) {
        super(kvadratMeter, etasje);
        this.harVarmtVann = harVarmtVann;
    }

    @Override
    public boolean harVann(){
        return true;
    }

    @Override
    public List<String> hentKvaliteter(){
        System.out.println("RomMedVann kvaliteter");
        List<String> kvaliteter = new LinkedList<>();

        if (harVarmtVann){
            kvaliteter.add("Har varmtvannstank");
        }
        return kvaliteter;
    }
}