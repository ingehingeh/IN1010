// IN1010 oblig 4 gruppearbeid
// Del C: Klassen Pasient
// Endret klassene som tar inn en int pasientid til Pasient pasient.

public class HvitResept extends Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  // må implementeres
    protected Pasient pasient;
    protected int reit;
    private String farge = "hvit";

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
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