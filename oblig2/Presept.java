// IN1010 vår 22 oblig 2: Resepter

public class Presept extends HvitResept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected int pasientId;
    protected int reit;

    public Presept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    public int prisAaBetale(int pris) {
        pris -= 108;
        if (pris <0) {
            return 0;
        } else {
            return pris;
        }
    }

    public String hentKlasse() { // egen test metode
        return "P-Resept";
    }

    @Override
    public String toString() {
        return super.toString() + " | Rabatt: -108kr";
    }
    
}