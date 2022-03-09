// IN1010 oblig 4 gruppearbeid
// Del C: Klassen Pasient
// Endret klassene som tar inn en int pasientid til Pasient pasient.


public class BlaaResept extends Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected int reit;
    private String farge = "blaa";

    public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
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