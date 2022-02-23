import java.util.List;
import java.util.LinkedList;

public abstract class RomMedVann extends Rom{

    protected boolean harVarmtVann;

    public RomMedVann(int kvadratMeter, int etasje, boolean harVarmtVann){
        super(kvadratMeter, etasje);
        this.harVarmtVann = harVarmtVann;
        //System.out.println("Konstruktør rom med vann");
    }
    
    @Override
    public boolean harVann(){
        return true;
    }

    @Override
    public List<String> hentKvaliteter(){
        //System.out.println("ROmMedVann kvaliteter");
        List<String> kvaliteter = new LinkedList<>();
        if(harVarmtVann){
            kvaliteter.add("Har varmtvannstank");
        }
        return kvaliteter;
    }
}
