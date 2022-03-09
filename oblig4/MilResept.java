// IN1010 oblig 4 gruppearbeid
// Del C: Klassen Pasient
// Endret klassene som tar inn en int pasientid til Pasient pasient.

public class MilResept extends HvitResept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected Pasient pasient;
    private int reit = 3; // starter alltid som 3

    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient) {
        super(legemiddel, utskrivendeLege, pasient, 3); // reit = 3
    }

    @Override 
    public int prisAaBetale(int pris) {
        return 0;
    }

    public String hentKlasse() { // egen test metode
        return "Militær Resept";
    }

    @Override
    public String toString() {
        return super.toString() + " | Rabatt: 100%";
    }
    
    
}

/*Retter-kommentar:
Når du har et program som arver fra en superklasse behøver du ikke å opprette alle 
instansvariablene som arves på nytt.

F.eks. i Militaerresept, kunne du gjort slik:

public class Militaerresept extends HvitResept {

    public Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId) {
        super(legemiddel, utskrivendeLege, pasientId, 3); // reit = 3
    }
}
*/