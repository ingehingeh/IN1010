public class Spesialist extends Lege implements Godkjenningsfritak {
    String kontrollID;

    public Spesialist(String navn, String kontrollID) {
        super(navn);
        this.kontrollID = kontrollID;
    }

    @Override
    public String hentKontrollID() {
        return kontrollID;
    }

    public String hentKlasse() { // egen test metode
        return "Spesialist";
    }

    @Override
    public String toString() {
        return super.toString() + " | KontrollID: " + kontrollID;
    }

}
