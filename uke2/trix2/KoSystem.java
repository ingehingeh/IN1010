// Trix Uke 2: 02.15: Enkelt køsystem

/* Kølapp system med klasser:
KoLapp - Skal ha en unikt nummer som sier når den ble trukket.
KoSystem - Skal kunne lage nye kølapper, etc
KoProgram - Skal ha en main-metode og en ordreløkke.
*/

import java.util.ArrayList;

public class KoSystem{
    
    private ArrayList<KoLapp> koLapper = new ArrayList<>();
    private int teller = 1;
    private int antKunder = 0;

    /*
    * Lager nytt objekt av KoLapp, legger til listen
    * over koLapper og skriver ut info om lappen
    */    
    public void trekkKoLapp(){
        KoLapp nyLapp = new KoLapp(teller);
        koLapper.add(nyLapp);
        teller ++;

        System.out.println("Du har billettnr." + nyLapp.hentNummer());
        System.out.print("Det er " + (koLapper.size() - 1) + "foran deg i køen.");
    }

    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista.
    // Gir feilmelding dersom ingen kunder staar i ko.
    /*
    
    */
    public void betjenKunde(){
        for (KoLapp kunde : koLapper) {
            System.out.println(kunde.hentNummer());
            koLapper[1] = KoLapp(3)

            koLapper.get() // get the first customer
            koLapper.remove(0)

        }
    }

    //Returnerer antall kunder som er i ko.
    public int antKunder(){
        return antKunder;

    }

    //Printer alle kunder i ko
    public void printKunderIKo(){

    }

}