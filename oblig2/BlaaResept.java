// IN1010 vår 22 oblig 2: Resepter

public class BlaaResept extends Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  // må implementeres
    protected int pasientId;
    protected int reit;
    protected int pris;
    private String farge = "blaa";

    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override 
    public String farge() {
        return "blaa";
    }

    @Override 
    public int prisAaBetale(int pris) {
        return (int)(pris*0.25);
    }

    public String hentKlasse() { // egen test metode
        return "Blå Resept";
    }

    @Override
    public String toString() {
        return super.toString() + " | Farge: " + farge + " | Type: " 
        + hentKlasse() + " | Rabatt: 75%";
    }
    
}