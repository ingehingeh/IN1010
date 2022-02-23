public class Rekkehus extends Hus implements HarNaboer{
    protected String bokstav;
    private int naboer = 0;
    private int braaketeNaboer = 0;

    public Rekkehus(int byggeAar, String adresse, boolean oppussingsobjekt,
     int antEtasjer, boolean harHage, String bokst) {
        super(byggeAar, adresse, oppussingsobjekt, antEtasjer, harHage);
        bokstav = bokst;
    }

    @Override
    public String hentAdresse() {
        return super.hentAdresse() + " " + bokstav;
    }

    @Override
    public boolean harBraaketeNabo(){
        return braaketeNaboer > 0;
    }

    @Override
    public boolean kanHaNaboOver(){
        return false;
    }

    @Override
    public void registerNyNabo(String hvor, boolean braaker) throws IkkeGyldigNabo{
        if(hvor != "venstre" && hvor != "hoyre"){
            throw new IkkeGyldigNabo("Rekkehus", hvor);
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
