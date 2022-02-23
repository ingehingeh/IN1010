import java.util.List;
import java.util.LinkedList;

public class Soverom extends Rom {
    private boolean harInnebygdSkap;

    public Soverom(int kvadratMeter, int etasje, boolean skap) {
        super(kvadratMeter, etasje);
        this.harInnebygdSkap = skap;
    }
    
    @Override
    public String typeRom() {
        return "Soverom";
    }

    @Override
    public List<String> hentKvaliteter() {
        List<String> kvaliteter = new LinkedList<>();

        if (harInnebygdSkap) {
            kvaliteter.add("Har innebygd skap");
        }

        if((! harInnebygdSkap && kvadratMeter >= 10) || (harInnebygdSkap && kvadratMeter >= 15)) {
            kvaliteter.add("Har plass til dobbeltseng");
        } 
        return kvaliteter;
      }

}
