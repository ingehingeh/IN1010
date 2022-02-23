import java.util.List;

public abstract class Rom {
    protected int kvadratMeter;
    protected int etasje;


    public Rom(int kvadratMeter, int etasje) {
        this.kvadratMeter = kvadratMeter;
        this.etasje = etasje;
        //System.out.println("Kjører Rom sin konstruktør");
    }

    public abstract String typeRom();

    public abstract List<String> hentKvaliteter();

    public int hentKvadratMeter() {
        return kvadratMeter;
    }

    public int hentEtasje() {
        return etasje;
    }

    public boolean harVann() {
        return false;
    }

    public String hentInfoOmRom(){
        String string = "\n------ROM-------";
        string += "\nType rom: " + typeRom();
        string += "\nKvadratmeter: " + kvadratMeter;
        string += "\nEtasje: " + etasje;
        string += "\nHar vann: " + harVann();
        string += "\nKvaliteter: ";
        List<String> kvaliteter = hentKvaliteter();
        for(String kvalitet: kvaliteter){
            string += "\n* " + kvalitet;
        }
        return string;
    }
    


}
