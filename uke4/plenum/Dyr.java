public abstract class Dyr {
    protected String navn;
    private int alder = 0;
    protected int matSpist;

    public Dyr(String navn) {
        matSpist = 0;
        this.navn = navn;
    }


    public String hentNavn() {
        return navn;
    }

    public int hentAlder() {
        return alder;
    }

    public void skrivInfo() {
        System.out.println(navn + " er " + alder + " år gammel");
    }


    public void haBursdag() {
        alder++;
    }

    public void spisMat() {
        matSpist += 1;
    }
}