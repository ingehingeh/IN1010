// IN1010 vår 22 oblig oppg 1: Dataklynge
// Rack

import java.util.ArrayList;

public class Rack {
    private int maksNoder;
    private ArrayList<Node> rack = new ArrayList<> ();

    ################ OBS: må endre ArrayList tl vanlig array ######################3

    public Rack(int maksNoder) {
        this.maksNoder = maksNoder;
    }

    public int getAntNoder() {
        return rack.size();
    }

    public void settInn(Node node) {
        if (getAntNoder() < maksNoder) {
            rack.add(node);
        }
    }
    
    public int antProsessorer() {
        int rackProsessorer = 0;
        for (Node node : rack) {
            rackProsessorer += node.antProsessor();
        }
        return rackProsessorer;
        }

    public int noderMedNokMinne(int paakrevdMinne) {
        int antNoder = 0;
        for (Node node : rack) {
            if (node.nokMinne(paakrevdMinne)) {
                antNoder += 1;
            }
        }
        return antNoder;
    }

}
