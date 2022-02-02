// IN1010 vår 22 oblig oppg 1: Dataklynge
// Dataklynge

import java.util.ArrayList;

class Dataklynge {
    private int noderPerRack = 0; // 6
    private ArrayList<Rack> dataklynge = new ArrayList<> ();

    public Dataklynge(int noderPerRack) {
        this.noderPerRack = noderPerRack;
    }

    public void settInnNode(Node node) {
        if (dataklynge.size() == 0) {
            System.out.println("Ingen rack! Lager nytt rack.");
            Rack nyRack = new Rack(noderPerRack);
            dataklynge.add(nyRack);
            // dataklynge.add(new Rack(noderPerRack));
        }

        Rack lastRack = dataklynge.get(dataklynge.size() - 1);
        System.out.println("str på lastRack: " + lastRack.getAntNoder());
        // System.out.println("noderPerRack: " + noderPerRack);
        if (lastRack.getAntNoder() == noderPerRack) {
            System.out.println("Siste rack fullt! Lager nytt rack.");
            dataklynge.add(new Rack(noderPerRack));
        }

        for (Rack rack : dataklynge) {
            if (rack.getAntNoder() < noderPerRack) {
                rack.settInn(node);
            }
        }
    }

    public void skrivUtDataklynge() {
        for (Rack rack : dataklynge) {
            System.out.println(rack);
            rack.skrivUtRack();
        }
    }

}

/*
Siste jobbet med:
- Fyller bare 5/6 Noder inn i Rack, før lager nytt Rack
- Må dobbeltsjekke indekser/tellinger så får fylt opp Racket til 6/6
 så lage nytt rack
*/