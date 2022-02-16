

// IN1010 vår 22 oblig 2: Resepter

//Blå resept = 75% rabatt/betaler bare 25%

public abstract class Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  
    protected int pasientId;
    protected int reit;

    protected int id;
    static int tellerId = 1; // start id-nr. fra 1

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        id = tellerId;
        tellerId ++;
    }
    public int hentId() {
        return id;
    }
    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }
    public Lege hentLege() {
        return utskrivendeLege;
    }
    public int hentPasientId() {
        return pasientId;
    }
    public int hentReit() {
        return reit;
    }

    public String hentKlasse() { // egen test metode
        return "Resept";
    }
    
    // Bruke resepten én gang. Returner false om
    // resepten alt er oppbrukt, ellers returnerer den true.
    public boolean bruk() {
        if (reit == 0) {
            return false;
        }
        reit -= 1;
        return true;
        }
        
    // blir definert i subklassene
    abstract public String farge();
    abstract public int prisAaBetale(int pris);

    public String toString() {
        return "Resept id: " + id + " | Legemiddel: " + legemiddel.hentNavn() + " | Lege: " 
        + utskrivendeLege.hentLege() + " | PasientId: " + pasientId + " | Reit: " + reit;
    }

    
}