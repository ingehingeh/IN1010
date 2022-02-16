// IN1010 vår 22 oblig 2: Resepter

// I tillegg til at de er gratis har militærresepter 
// den egenskapen at de alltid utskrives med 3 reit.

/*
Jeg ønsker å bruke super konstruktør fra Hvit resept eller Resept
MINUS reit
Overloading = Lage flere konstruktører med ulik ant argumenter
Override = Overskriv metode i subklasse (Velger denne)
*/


public class Militaerresept extends HvitResept {
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;  // må implementeres
    protected int pasientId;
    private int reit = 3;
    
    private int id;         // må implementeres
    private int TellerId;   // må implementeres

    public Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId) {
        super(legemiddel, utskrivendeLege, pasientId, 3); // reit = 3
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
