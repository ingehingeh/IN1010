// Trix Uke 2: 02.09: Skatt i Ruritania

import java.util.Scanner;

class SkattIRurtania {
    public static void main(String[] args) {
        double inntekt, over10k;
        double skatt1, skatt2;
        double skatteSats1 = 10; // prosent(%) skatt av inntekt
        double skatteSats2 = 30; // prosent(%) skatt av inntekt

        Scanner tastatur = new Scanner(System.in);

        System.out.println("Velkommen til skattekalkulatoren.");
        System.out.print("Skriv inn inntekt: ");
        inntekt = Double.parseDouble(tastatur.nextLine());

        if (inntekt < 10000) {
            skatt1 = inntekt * (skatteSats1/100);
            System.out.println("Inntekt: " + inntekt + " gir skatt: " + skatt1);

        } 
        else if (inntekt >= 10000) {
            over10k = inntekt - 10000;
            skatt1 = (inntekt - over10k) * (skatteSats1/100);
            skatt2 = over10k * (skatteSats2/100);
            
            System.out.println("Inntekt: " + inntekt + " gir skatt1: " + skatt1);
            System.out.println("Inntekt: " + inntekt + " gir skatt2: " + skatt2);
        }
    }
}