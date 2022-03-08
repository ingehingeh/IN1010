// IN1010 vår 22 oblig 2: Legemidler
// System som holder styr på leger, pasienter, resepter og legemidler.

// Del A: Legemidler
// 3 kategorier, narkotisk, vanedannende og vanlige legemidler.

public class Vanlig extends Legemiddel {

    public Vanlig(String navn, int pris, double virkestoff) {
        super(navn, pris, virkestoff);
    }

    @Override
    public String hentKlasse() { // egen test metode
        return "Vanlig";
    }

    @Override
    public String toString(){
        return super.toString() + " | Vanlig";
    }
    
}