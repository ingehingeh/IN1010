// Trix Uke 2: 02.10: Handletur

import java.util.HashMap;
import java.util.Scanner;

class Handletur {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        HashMap<String, Integer> handleListe = new HashMap<>();
        handleListe.put("Broed", 20);
        handleListe.put("Melk", 15);
        handleListe.put("Ost", 40);
        handleListe.put("Yogurt", 12);

        System.out.println("Hei! Velkommen til IFI-butikken.");

        int totalSum = 0;
        for (String varen : handleListe.keySet())  {
            System.out.print("Hvor mange " + varen + " vil du ha?\n> ");
            int antall = Integer.parseInt(tastatur.nextLine());
            // evt.    = tastatur.nextInt();
            totalSum += handleListe.get(varen) * antall;
        }
        System.out.println("Du skal betale: " + totalSum + " kr.");

    }
}
