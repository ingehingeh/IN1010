public abstract class Hus extends Bolig {
    protected int antEtasjer;
    protected boolean harHage;

    public Hus(int byggeAar, String adresse, boolean oppussingsobjekt, int etg, boolean hage) {
        super(byggeAar, adresse, oppussingsobjekt);
        antEtasjer = etg;
        harHage = hage;
    }

    
}
