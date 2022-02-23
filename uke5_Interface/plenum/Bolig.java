import java.util.ArrayList;
import java.util.List;

public abstract class Bolig {
    protected int byggeAar;
    protected List<Rom> rommene;
    protected String adresse;
    protected boolean oppussingsobjekt;

    public Bolig(int byggAar, String adr, boolean oppussing) {
        byggeAar = byggAar;
        adresse = adr;
        oppussingsobjekt = oppussing;
        rommene = new ArrayList<>();
    }

    public String hentAdresse() {
        return adresse;
    }

    @Override
    public boolean equals(Object annen) {
        if (! (annen instanceof Bolig)) {
            return false;
        }
        Bolig annenBolig = (Bolig) annen;
        return this.hentAdresse().equals(annenBolig.hentAdresse());
    }

    public void leggTilRom(Rom rom){
        rommene.add(rom);
    }

    public int hentKvadratMeter() {
        int kvadratMeter = 0;
        for(Rom rom : rommene){
            kvadratMeter += rom.hentKvadratMeter();
        }
        return kvadratMeter;
    }

}