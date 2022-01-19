// Foreles 18.01.22
import java.util.Scanner;

class LesFraTerminal {
    public static void main(String[] args) {
        int alder;
        String navn, adresse;
        Scanner minInn = new Scanner(System.in);

        System.out.print(" Skriv addresse: ");
        System.out.flush();
        
        adresse = minInn.nextLine();
        System.out.print(" Skriv fornavn: ");
        System.out.flush();
        
        navn = minInn.next();
        System.out.print(" Skriv alder: ");
        alder = minInn.nextInt();
        System.out.println(navn + " bor i " + adresse + " og er " + alder + "ar");
    }
}

/* Googler: Java api 8 Scanner - for å sjekke hvordan Scanner fungerer
https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
A Scanner breaks its input into tokens using a delimiter pattern, 
which by default matches whitespace. 
The resulting tokens may then be converted into values of different types 
using the various next methods.

vi bruker metodene:
next() - Finds and returns the next complete token from this scanner.
nextline() - Advances this scanner past the current line 
            and returns the input that was skipped.
nextInt() - Scans the next token of the input as an int.

*/