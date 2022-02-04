// IN1010 vår 22 oblig oppg 1: Dataklynge
// Rack

public class Rack {
    private int maksNoder; // sette lik 12 her eller annet sted?
    // private ArrayList<Node> rack = new ArrayList<> ();
    Node[] rack = new Node[12]; 

    public Rack(int maksNoder) {
        this.maksNoder = maksNoder;
    }

    public int getAntNoder() {
        int teller = 0;
        while (teller < maksNoder && rack[teller] != null) {
            teller += 1;
         }
        // System.out.println("getAntNoder() = " + teller);
        return teller;
    }

    public void skrivUtRack() { // egen test metode
        for (Node node : rack) {
            System.out.println(node);
        }
    }

    public void settInn(Node node) {
        for (int i = 0; i < maksNoder; i++) {
            //System.out.print("i= " + i);
        
            if (rack[i] == null){
                rack[i] = node;
                // System.out.print(" Node inn på plass" + i + "\n");
                break; // evt. bytt med lærer forslag
                }
        }
    }

    public int antProsessorer() {
        int rackProsessorer = 0;
        for (Node node : rack) {
            if (node != null) {
                rackProsessorer += node.antProsessor();
            }
        }
        return rackProsessorer;
    }

    public int noderMedNokMinne(int paakrevdMinne) {
        int antNoder = 0;
        for (Node node : rack) {
            if (node != null) {
                if (node.nokMinne(paakrevdMinne)) {
                    antNoder += 1;
                }   
            }
        }
        return antNoder;
    }
}



/* LF sin versjon av Array og Array-Loop:
    Person[] telefonbok = new Person[10];
    telefonbok[0] = joakim;
    telefonbok[1] = kristin;
    telefonbok[2] = dag;

    // skriver ut info om hvert Person-objekt i Array
    for (int i=0; i < telefonbok.length; i++) {
        if (telefonbok[i] != null) {
            telefonbok[i].skrivInfo();
        }
    }
*/
