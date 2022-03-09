// IN1010 oblig 4 gruppearbeid
// Del D: Lege

// implementer Comparable<Lege> og skriv compareTo() metode

import java.lang.Comparable;

public class Lege implements Comparable<Lege> {
    String navn;
    IndeksertListe<Resept> utskrevneResepter = new IndeksertListe();

    public Lege(String navn) {
        this.navn = navn;
    }

    public String hentLege() {
        return navn;
    }

    public String hentKlasse() { // egen test metode
        return "Lege";
    }

    public String toString() {
        return "Type: " + hentKlasse() + " | Navn: " + navn;
    }

    // Nytt i oblig 4 --------------------

    public HvitResept skrivHvitResept (Legemiddel legemiddel, Pasient pasient, int reit)
    throws UlovligUtskrift {     
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel); // this er dette Lege-objektet
        }
        HvitResept nyResept = new HvitResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyResept); // legger til Lege sin IndeksertListe
        pasient.reseptListe.add(nyResept);   // legger til Pasient sin ArrayList
        return nyResept;
    }

    public MilResept skrivMilResept (Legemiddel legemiddel, Pasient pasient) 
    throws UlovligUtskrift {     
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        MilResept nyResept = new MilResept(legemiddel, this, pasient);
        utskrevneResepter.leggTil(nyResept); 
        pasient.reseptListe.add(nyResept);   
        return nyResept;
    }

    public PResept skrivPResept (Legemiddel legemiddel, Pasient pasient, int reit)
    throws UlovligUtskrift {     
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        PResept nyResept = new HvitResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyResept);
        pasient.reseptListe.add(nyResept);
        return nyResept;
    }

    // Spesialister kan alltid skrive ut Narkotiske legemidler men bare på blå resept.
    public BlaaResept skrivBlaaResept (Legemiddel legemiddel, Pasient pasient, int reit)
    throws UlovligUtskrift {     
        if ((legemiddel instanceof Narkotisk) && !(this instanceof Spesialist)) {
            throw new UlovligUtskrift(this, legemiddel);
        }
        BlaaResept nyResept = new HvitResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyResept);
        pasient.reseptListe.add(nyResept);
        return nyResept;
    }

    public hentUtskrevneResepter() {
        return utskrevneResepter;
    }

    @Override
    public int compareTo(Lege andreLege) {
        return this.navn.compareTo(andreLege.navn);
    }
    /*
    Anders.compareTo(Bjorn) -> -1
    Bjorn.compareTo(Anders) -> 1
    Anders.compareTo(Anders) -> 0
    */
    
}
