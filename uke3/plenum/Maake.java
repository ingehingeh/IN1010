public class Maake extends Fugl {

    private int soppelSpist = 0;

    public Maake(String navn, int hastighet){
        super(navn, hastighet);
    }

    public void spistSoppel(){
        soppelSpist++;
    }

    public String skrik(){
        return "vhaa vhaa" + navn;
    }

    public double prosentSoppel(){
        int sum = soppelSpist + matSpist;
        return ((double) soppelSpist/sum) * 100;
    }
    
}
