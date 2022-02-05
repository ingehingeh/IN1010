// IN1010 vår 22 oblig 1: Dataklynge
// Klasse for representasjon av et datasenter

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Hovedprogram {
    public static void main(String[] args) {
        
        // Oppretter et datasenter, angir dataklynge-filnavn
        Dataklynge saga = new Dataklynge(12);
        String filnavn = "dataklynge2.txt";
        Scanner sc = null;
    
        try {
            sc = new Scanner(new File(filnavn));
        }
        // fanger feilen og terminerer dersom ikke filen eksisterer
        catch (FileNotFoundException e) {
            System.out.println("OBS: finner ikke filen");
        }

        // Leser inn data om en dataklynge fra fil
        // @param filnavn filene der dataene for dataklyngen ligger
        while (sc.hasNextLine()) {
            String[] biter = sc.nextLine().split(" ");

            int antNoder = Integer.parseInt(biter[0]);
            int antProsPrNode = Integer.parseInt(biter[1]);
            int minnePrNode = Integer.parseInt(biter[2]);

            // setter inn Noder etter angitte spesifikasjoner i tekstfilen
            for (int i = 0; i < antNoder; i++){
                saga.settInnNode(new Node(minnePrNode, antProsPrNode)); // type1 node
            }
        }
        // sjekker antall Noder med gitt minste minnestørrelse
        int[] sjekkMinner = {128, 512, 1024};
            for (int i : sjekkMinner) {
                System.out.print("Noder med minst " + i + " GB: ");
                System.out.print(saga.noderMedNokMinne(i) + "\n");
            }
            System.out.println("Antall prosessorer: " + saga.antProsessorer());
            System.out.println("Antall rack i bruk: " + saga.antRacks());

        sc.close();

    }
}
