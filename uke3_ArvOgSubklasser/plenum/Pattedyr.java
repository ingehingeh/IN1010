public abstract class Pattedyr extends Dyr{
    private boolean langharet;

    public Pattedyr(String navn, boolean langh) {
        super(navn);
        langharet = langh;
    }

    public String kortEllerLangPels() {
        if (langharet) {
            return "Langhåret";
        }
        return "Korthåret";
    }


}
