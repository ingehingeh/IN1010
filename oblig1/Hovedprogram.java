// IN1010 vår 22 oblig oppg 1: Dataklynge
// Hovedprogram

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Hovedprogram {
    public static void main(String[] args) {
        
        Dataklynge saga = new Dataklynge(12);
        String filnavn = "dataklynge2.txt";
        Scanner sc = null;
        

        try {
            sc = new Scanner(new File(filnavn));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        }

        while (sc.hasNextLine()) {
            String[] biter = sc.nextLine().split(" ");

            int antNoder = Integer.parseInt(biter[0]);
            int antProsPrNode = Integer.parseInt(biter[1]);
            int minnePrNode = Integer.parseInt(biter[2]);

            //System.out.println(antNoder);
            //System.out.println(antProsPrNode);
            //System.out.println(minnePrNode);

            for (int i = 0; i < antNoder; i++){
                saga.settInnNode(new Node(minnePrNode, antProsPrNode)); // type1 node
            }
        }
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

/*abstract
for (int i = 0; i < 16; i++){
saga.settInnNode(new Node(1024, 16)); // type2 node
}
*/