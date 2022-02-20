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
    protected Lege utskrivendeLege;
    protected int pasientId;
    private int reit = 3; // starter alltid som 3

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