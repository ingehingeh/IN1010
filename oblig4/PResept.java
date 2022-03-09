// IN1010 oblig 4 gruppearbeid
// Del C: Klassen Pasient
// Endret klassene som tar inn en int pasientid til Pasient pasient.

public class PResept extends HvitResept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected Pasient pasient;
    protected int reit;

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
    }

    public int prisAaBetale(int pris) {
        pris -= 108;
        if (pris <0) {
            return 0;
        } else {
            return pris;
        }
    }

    public String hentKlasse() {
        return "P-Resept";
    }

    @Override
    public String toString() {
        return super.toString() + " | Rabatt: -108kr";
    }
    
}