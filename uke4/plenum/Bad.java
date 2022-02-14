// Uke 4 plenum
// Rom hos utleiemegler (2 ukers prosjekt)

import java.util.List;
import java.util.LinkedList; // enklere datastruktur enn ArrayList

public abstract class Bad extends RomMedVann {

    private boolean harBadekar, harVaskemaskin;

    public Bad(int kvadratMeter, int etasje, boolean harVarmtVann, boolean harBadekar, boolean harVaskemaskin) {
        super(kvadratMeter, etasje, harVarmtVann);
        this.harBadekar = harBadekar;
        this.harVaskemaskin = harVaskemaskin;
    }

    @Override
    public String typeRom(){
        return "Bad";
    }

    @Override
    public List<String> hentKvaliteter(){
        List<String> kvaliteter = super.hentKvaliteter();

        if (harBadekar){
            kvaliteter.add("Har badekar");
        }
        if (harVaskemaskin){
            kvaliteter.add("Har vaskemaskin");
        }
        return kvaliteter;
    }


}