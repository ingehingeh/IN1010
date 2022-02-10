public abstract class Fugl extends Dyr{
    protected int hastighet;

    public Fugl(String navn, int h) {
        super(navn);
        hastighet = h;
    }

    public int hentHastighet(){
        return hastighet;
    }

    public void flyTid(int avstand){
        int tid = avstand/hastighet;
        System.out.println("Det tar " + tid + " aa fly " + avstand);
    }
}
