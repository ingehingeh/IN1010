// IN1010 vår 22 oblig 2: Legemidler
// System som holder styr på leger, pasienter, resepter og legemidler.

// Del A: Legemidler
// 3 kategorier, narkotisk, vanedannende og vanlige legemidler.

public class Vanedannende extends Legemidler {

    int styrke;

    public Vanedannende(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }

    public int hentVanedannendeStyrke() {
        return styrke;
    }

    @Override
    public String hentKlasse() { // egen test metode
        return "Vanedannende";
    }

    @Override
    public String toString(){
        return super.toString() + " | Vanedannende | Styrke: " + styrke;
    }
    
}
