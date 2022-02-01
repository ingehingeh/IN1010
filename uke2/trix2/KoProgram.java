// Trix Uke 2: 02.15: Enkelt køsystem

/* Kølapp system med klasser:
KoLapp - Skal ha en unikt nummer som sier når den ble trukket.
KoSystem - Skal kunne lage nye kølapper, etc
KoProgram - Skal ha en main-metode og en ordreløkke.
*/

import java.util.Scanner;

public class KoProgram {
    public static void main(String[] args) {
        KoSystem koSystem = new KoSystem();
        Scanner tastatur = new Scanner(System.in);

        System.out.println("**MENY FOR BILLETTSYSTEM**");
        System.out.println("1 - Trekk ny kolapp.\n2 - Betjen kunde.");
        System.out.println("3 - Print antall kunder i kø.\n4 - Avslutt.");
        String bInput = "0";

        while (bInput != "4") {
            bInput = tastatur.nextLine();

            if (bInput == "1") {
                koSystem.trekkKoLapp();
            } else if (bInput == "2") {
                koSystem.betjenKunde();
            } else if (bInput == "3"){
                System.out.println("Antall kunder: " + koSystem.antKunder());
            }
            System.out.println("**MENY FOR BILLETTSYSTEM**");
            System.out.println("1 - Trekk ny kolapp.\n2 - Betjen kunde.");
            System.out.println("3 - Print antall kunder i kø.\n4 - Avslutt.");
        }
        System.out.println("Programmet avsluttes.");

    }
}
