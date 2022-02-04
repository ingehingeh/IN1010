// IN1010 vår 22 oblig oppg 1: Dataklynge
// Hovedprogram2

// Trix Uke 2: 02.12: Enkel lesing fra fil

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
class FraFil {
    public static void main(String[] args)
    throws FileNotFoundException {
        File minFil = new File("tekst.txt");
        Scanner lesFil = new Scanner(minFil);

        while (lesFil.hasNextLine()) {
            String linje = lesFil.nextLine();
            System.out.println("På linjen står det: " + linje);

        }
    }
}

class Skanner {
    public static void main(String[] args){
        minFil("test.txt");

    public class lesFil() {
        Scanner sc = null;

        try {
            sc = new Scanner(new File(filnavn));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
    }
}
*/



class Hovedprogram2 {
    public static void main(String[] args) {
        String filnavn = "dataklynge4.txt";
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

            System.out.println(antNoder);
            System.out.println(antProsPrNode);
            System.out.println(minnePrNode);
            
        }

        sc.close();

    }
}

/*
        Dataklynge saga = new Dataklynge(12);

        for (int i = 0; i < 450; i++){
            saga.settInnNode(new Node(512, 4)); // type1 node
        }

        for (int i = 0; i < 16; i++){
            saga.settInnNode(new Node(1024, 16)); // type2 node
        }

        int[] sjekkMinner = {128, 512, 1024};
        for (int i : sjekkMinner) {
            System.out.print("Noder med minst " + i + " GB: ");
            System.out.print(saga.noderMedNokMinne(i) + "\n");
        }

        System.out.println("Antall prosessorer: " + saga.antProsessorer());
        System.out.println("Antall rack i bruk: " + saga.antRacks());
        // saga.skrivUtDataklynge();

    }
}
*/