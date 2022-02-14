// IN1010 vår 22 oblig 2: Legemidler
// System som holder styr på leger, pasienter, resepter og legemidler.

// Del A: Legemidler
// 3 kategorier, narkotisk, vanedannende og vanlige legemidler.

public abstract class Legemidler {
    protected String navn;
    protected int pris;
    protected double virkestoff;
    private int id;
    static int tellerId = 1; // start id-nr. fra 1

    public Legemidler(String navn, int pris, double virkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;

        id = tellerId;
        tellerId ++;
    }

    public int hentId() {
        return id;
    }

    public String hentNavn() {
        return navn;
    }

    public double hentPris() {
        return pris;
    }

    public double hentVirkestoff() {
        return virkestoff;
    }

    public void settNyPris(int nyPris) {
        pris = nyPris;
    }

    public String hentKlasse() { // egen test metode
        return "Legemiddel";
    }

    @Override
    public String toString() {
        return "Legemiddel id: " + id +  " | Navn: " + navn + " | Pris(kr): " + pris + 
        " | Virkestoff(mg): " + virkestoff;
    }

}
