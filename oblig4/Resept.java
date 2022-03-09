// IN1010 oblig 4 gruppearbeid
// Del C: Klassen Pasient
// Endret klassene som tar inn en int pasientid til Pasient pasient.

public abstract class Resept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  
    protected Pasient pasient;
    protected int reit;

    protected int id;
    static int tellerId = 1; // start id-nr. fra 1

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasient = pasient;
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
    public int hentPasient() {
        return pasient;
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
        + utskrivendeLege.hentLege() + " | Pasient: " + pasient + " | Reit: " + reit;
    }

    
}