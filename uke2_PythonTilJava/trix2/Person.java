// Trix Uke 2: 02.08: Samlinger av objekter

// Du får utdelt følgende klasse:
class Person {

    private String navn;
    private int telefonnummer;
    private String adresse;

    public Person(String navn, int telefonnummer, String adresse) {
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
    }

    public void skrivInfo() {
        System.out.println("Navn: " + navn);
        System.out.println("Telefonnummer: " + telefonnummer);
        System.out.println("Adresse: " + adresse + "\n");
    }

    public String hentNavn() {
        return navn;
    }
}
