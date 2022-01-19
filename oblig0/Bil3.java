// Oblig0: Oppg 3a

public class Bil3 {
    String bilNummer;

    public Bil3(String nr) {
        // hvert Bil3-objekt får et bilNr
        bilNummer = nr;
    }

    public void skrivUt() {
        // skriver ut bilNr
        System.out.println("Bilnummeret er: " + bilNummer);
    }

    public String hentNummer() {
        // returnerer bilNr
        return bilNummer;
    }
    
}