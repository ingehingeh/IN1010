// Oblig0: Oppg 3b)

public class Person {
    String navn;
    Bil3 bil;

    public Person(String n, Bil3 b) {
        // gir Person navn og bil ved opprettelse
        navn = n;
        bil = b;
    }

    public void skrivUt() {
        // skriver ut navn og bilNr
        System.out.println("Navn: " + navn);
        System.out.println("Bil: " + bil.hentNummer());
    }

}

