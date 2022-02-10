public class Katt extends Pattedyr {

    private int musSpist = 0;

    public Katt(String navn, boolean langharet) {
        super(navn, langharet);
    }

    // metoder fra Dyr

    public String mjau() {
        return "Mjauuuu";
    }


    public void spisMus() {
        musSpist++;
        matSpist++;
    }

    public double prosentMusSpist() {
        return ( (double) musSpist / matSpist) * 100;
    }

}
