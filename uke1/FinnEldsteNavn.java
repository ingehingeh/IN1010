// Uke 1: Foreles 3; Lese fra fil (Java versjon)

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FinnEldsteNavn {
    public static void main(String[] args)
    // Kan også håndtere unntak/exceptions med try,catch mtode
    // Forklart i 'Enkel lesing og skriving i Java' notat(bokmerket)
    throws FileNotFoundException {
        File fil = new File("alder.txt");
        Scanner sc = new Scanner(fil);
        
        String eldsteNavn = "ingen";
        int maksAlder = 0;

        while (sc.hasNextLine()) {
            String[] biter = sc.nextLine().split(" ");
            String navn = biter[0];

            //* Bruker "Wrapper"-klasse for Integer. e.g. Integer.MAX_VALU
            // parseInt returnerer String som int (må bare inneholde heltall)
            // String alderString = biter[1]; // String fra input
            // String alderStringTrim = alderString.trim(); // fjerner whitespace
            // int alder = Integer.parseInt(alderStringTrim); // konv. til int
            
            int alder = Integer.parseInt(biter[1]);
            if (alder > maksAlder) {
                maksAlder = alder;
                eldsteNavn = navn;
            }
        }
        System.out.println(eldsteNavn);
        sc.close();


        }
    }

