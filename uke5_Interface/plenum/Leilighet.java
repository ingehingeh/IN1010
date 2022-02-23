public class Leilighet extends Bolig implements HarNaboer{
    protected int etasje, leilighetsNr, fellesgjeld, verandastoerrelse;
    private int naboer = 0;
    private int braaketeNaboer = 0;

    public Leilighet(int byggeAar, String adresse, boolean oppussingsobjekt,
     int etg, int leilighetnr, int gjeld, int verranda) {
        super(byggeAar, adresse, oppussingsobjekt);
        etasje = etg;
        leilighetsNr = leilighetnr;
        fellesgjeld = gjeld;
        verandastoerrelse = verranda;
    }

    @Override
    public String hentAdresse() {
        return adresse + " " + leilighetsNr;
    }

    @Override
    public boolean harBraaketeNabo(){
        return braaketeNaboer > 0;
    }

    @Override
    public boolean kanHaNaboOver(){
        return true;
    }

    @Override
    public void registerNyNabo(String hvor, boolean braaker) throws IkkeGyldigNabo{
        if(hvor != "venstre" && hvor != "hoyre" && hvor != "oppe" && hvor != "nede"){
            throw new IkkeGyldigNabo("Leilighet", hvor);
        }
        naboer++;
        if(braaker){
            braaketeNaboer++; //braaketeNaboer += 1;
        }
    }

    @Override
    public int hentAntallNaboer(){
        return naboer;
    }
}
