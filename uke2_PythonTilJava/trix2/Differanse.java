// TRIX Uke 2: 02.01: Differansen mellom to heltall
// Lag et program som ber om og leser inn to heltall.

import java.util.Scanner; // tar input fra bruker
import java.lang.Math; // for å ta absoluttverdi

// Sett hovedklasse som public
public class Differanse {
    public static void main(String[] args) {
        //Deklarerer variabler
        int tall1, tall2, diff, absDiff;

        // oppretter Scanner for å lese fra input/tastatur
        Scanner minInput = new Scanner(System.in);

        System.out.print("Skriv tall1: ");
        tall1 = minInput.nextInt(); // tolker input direkte som int
        // tall1Lest = minInput.nextLine(); // oppdaterer verdien til lest.
        // tall1 = Integer.parseInt(tall1Lest); // konverterer fra String til int.
        

        System.out.print("Skriv tall2: ");
        tall2 = minInput.nextInt();

        diff = tall1 - tall2;
        absDiff = Math.abs(diff);

        System.out.println("Abs. diff er: " + absDiff);
        
    }
}
