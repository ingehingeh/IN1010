// Trix Uke 2: 02.04: Enkel telefonbok
// Vi skal i denne oppgaven lage en enkel telefonbok, 
// der bruker kan søke på navn for å hente telefonnummer.

/*  a) Lag en klasse Telefonbok med en main-metode. 
Opprett en HashMap med nøkkeltype String og verditype String.

/*b) Fyll HashMap'en med følgende relasjoner:
("Arne", "22334455")
("Lisa", "95959595")
("Jonas", "97959795")
("Peder", "12345678") 

c) Lag en ordreløkke der bruker kan søke etter navn, og få opp det tilhørende telefonnummeret.
d) Gjør slik at når bruker avslutter, løper du igjennom alle nøklene i HashMapen 
- og skriver ut navn og telefonnummer.
Hint: HashMap har en funksjon som heter keySet() som henter alle nøkler (navnene). */

import java.util.Scanner;
import java.util.HashMap;

class Telefonbok {
    public static void main(String[] args) {

        // a) oppretter tom HashMap med nøkkel,verdi som String,String
        HashMap<String,String> telefonbok = new HashMap<> ();

        // b) Fyller HashMap'en med elementer
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        // c) Lag ordreløkke for å søke etter navn, og få tilhørende tlf. nr.
        Scanner minInput = new Scanner(System.in);

        int input = 0;
        while (input != 1) {
            System.out.println("Meny:\n0: Soek etter person\n1: Avslutt\n----------");
            input = Integer.parseInt(minInput.nextLine());

            if (input == 0) {
                System.out.println("Hvem vil du ha nr. til?");
                String navn = minInput.nextLine();

                if (telefonbok.containsKey(navn)) {
                    String tlf = telefonbok.get(navn);
                    System.out.println("Navn: " + navn + " tlf: " + tlf + "\n----------");
                } else {
                    System.out.println("Fant ikke " + navn + ".\n----------");
                }
            }
        }
            System.out.println("Oversikt:");
            for (String navnekey : telefonbok.keySet()) {
                System.out.println("Navn: " + navnekey + ", tlf: " 
                + telefonbok.get(navnekey));
            }
        }
    }
    