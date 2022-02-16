// IN1010 vår 22 oblig 2: Resepter

public class HvitResept extends Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  // må implementeres
    protected int pasientId;
    protected int reit;
    private String farge = "hvit";

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override 
    public String farge() {
        return "hvit";
    }

    @Override 
    public int prisAaBetale(int pris) {
        return pris;
    }

    public String hentKlasse() { // egen test metode
        return "Hvit Resept";
    }

    @Override
    public String toString() {
        return super.toString() + " | Farge: " + farge + " | Type: " + hentKlasse();
    }
    
}