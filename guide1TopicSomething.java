// General guide on: 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

// Lesing av filer
import java.io.File;
import java.io.FileNotFoundException;

class Div {
    public static void main(String[] args) {

        // Arrays
        int[] a = new int[4]; // Lager int array av str/lengde 4 (4 plasser)

        // Scanner (input fra terminal)
        // Flere tips i: NyttigeScannerMetoder.txt i uke1 mappen
        Scanner minInput = new Scanner(System.in);

        System.out.print(" Skriv fornavn: ");
        navn = minInput.next();
        String minInput = scanner.next();
        // kan bruke scanner.nextInt()
        // eller scanner.nextDouble()
        int int_inp = Integer.parseInt(minInput);
        double double_inp = Double.parseDouble(minInput);
        

        // Fil lesing
        // Kan også håndtere unntak/exceptions med try,catch metode (mer optimalt)
        // Forklart i 'Enkel lesing og skriving i Java' notat(bokmerket)
        public static void main(String[] args)
        throws FileNotFoundException {
            File fil = new File("alder.txt");
            Scanner sc = new Scanner(fil);

            while (sc.hasNextLine()) {
                String[] biter = sc.nextLine().split(" ");
                String navn = biter[0];
        }
        sc.close();
        



        
    }
}