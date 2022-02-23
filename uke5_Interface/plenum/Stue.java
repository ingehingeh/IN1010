import java.util.List;
import java.util.LinkedList;


public class Stue extends Rom{
    private boolean harPeis;

    public Stue(int kvadratMeter, int etasje, boolean harPeis) {
        super(kvadratMeter, etasje);
        this.harPeis = harPeis;
    }


    @Override
    public String typeRom() {
        return "Stue";
    }

    
    @Override
    public List<String> hentKvaliteter() {
        List<String> kvaliteter = new LinkedList<>();

        if (harPeis) {
            kvaliteter.add("Rommet har peis");
        }
        return kvaliteter;
    }
}
