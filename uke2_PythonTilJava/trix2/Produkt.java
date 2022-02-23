// TRIX Uke 2: 02.02: Produktet av to heltall
// a) Lag et program som ber om og leser inn to heltall. 
// b) Endre programmet slik at programmet sjekker om differansen 
//    mellom tallene er positiv eller negativ og skriver ut en passende beskjed til brukeren.

import java.util.Scanner;

class Produkt {
    public static void main(String[] args) {
        int x, y, diff, prod;
        Scanner minInput = new Scanner(System.in);

        System.out.print("Oppgi verdi til x: ");
        x = minInput.nextInt();
        // x = Integer.parseInt(minInput.nextLine());
        System.out.print("Oppgi verdi til y: ");
        y = minInput.nextInt();
        // y = Integer.parseInt(minInput.nextLine());

        diff = x - y;
        if (diff < 0) {
            System.out.println("Differansen mellom x og y er: negativ");
        }
        else {
            System.out.println("Differansen mellom x og y er: positiv");
        }

        System.out.println("Produktet er: " + (x*y));
    }
}