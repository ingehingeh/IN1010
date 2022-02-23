// Trix Uke 2: 02.13: Lese temperatur fra fil

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class TemperaturLeser {
    public static void main(String[] args) 
    throws FileNotFoundException {
    
        // a) opprett String-array med 12 plasser
        String[] tempArray = new String[12];

        // b) Lag et Scanner-objekt for å lese filen "Temperatur.txt".
        // File tempFil = new File("Temperatur.txt");
        // Scanner lesFil = new Scanner(tempFil);
        Scanner fil = new Scanner(new File("Temperatur.txt"));

        // c) Legg til  løkke. Lagre hver linje i array. Bruk teller.
        int teller = 0;
        while (fil.hasNextLine()) {
            tempArray[teller] = fil.nextLine();
            teller ++;
        }

        // d) Print ut alle elementene i arrayen.
        // For løkke med indeksering
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }

        // For-each løkke
        for (String temp : tempArray) {
            System.out.println("Temperatur: " + temp);
        }



    }
}