// IN1010 vår 22 oblig 2: Leger

public class Lege {
    String navn;

    public Lege(String navn) {
        this.navn = navn;
    }

    public String hentLege() {
        return navn;
    }

    public String hentKlasse() { // egen test metode
        return "Lege";
    }

    public String toString() {
        return "Type: " + hentKlasse() + " | Navn: " + navn;
    }
    
}
