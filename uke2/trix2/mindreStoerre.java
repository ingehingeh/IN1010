// TRIX Uke 2: 02.03: Mindre enn eller større enn
// a) Lag et program som tar inn et tall fra brukeren og skriver ut om tallet er mindre eller større enn 10.
// b) Legg deretter til en test til for å sjekke om tallet er mindre eller større enn 20.
// c) Endre programmet slik at brukeren kun får én tilbakemelding per tall som er tastet innn.

import java.util.Scanner;

class mindreStoerre {
    public static void main(String[] args) {
        int tall;

        // oppretter Scanner for å ta input fra tastatur
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Tast inn tall: ");
        tall = Integer.parseInt(tastatur.nextLine());

        if (tall < 10) {
            System.out.println("Tallet er mindre enn 10");
        }
        else if (10 < tall && tall < 20) {
            System.out.println("Tallet er mellom 10 og 20");
        }
        else if (tall > 20) {
            System.out.println("Tallet er stoerre enn 20");
            
        }
    }
}