// IN1010 vår 22 oblig oppg 1: Dataklynge
// Dataklynge

import java.util.ArrayList;

class Dataklynge {
    private int noderPerRack = 0; // 12
    private ArrayList<Rack> dataklynge = new ArrayList<> ();

    public Dataklynge(int noderPerRack) {
        this.noderPerRack = noderPerRack;
    }

    public void settInnNode(Node node) {
        if (dataklynge.size() == 0) {
            //System.out.println("Ingen rack! Lager nytt rack.");
            Rack nyRack = new Rack(noderPerRack);
            dataklynge.add(nyRack);
            // dataklynge.add(new Rack(noderPerRack));
        }

        Rack lastRack = dataklynge.get(dataklynge.size() - 1); // get last Rack
        // System.out.println(lastRack);
        //System.out.println("str på lastRack: " + lastRack.getAntNoder());
        // System.out.println("noderPerRack: " + noderPerRack);
        if (lastRack.getAntNoder() == noderPerRack) {
            //System.out.println("Siste rack fullt! Lager nytt rack.");
            dataklynge.add(new Rack(noderPerRack));
        }

        for (Rack rack : dataklynge) {
            if (rack.getAntNoder() < noderPerRack) {
                rack.settInn(node);
            }
        }
    }

    public void skrivUtDataklynge() { // test metode
        for (Rack rack : dataklynge) {
            System.out.println(rack + "----");
            rack.skrivUtRack();
            System.out.println("---------------");
        }
    }

    public int antProsessorer() {
        int dataklyngeProsessorer = 0;
        for (Rack rack : dataklynge) {
            dataklyngeProsessorer += rack.antProsessorer();
        }
        return dataklyngeProsessorer;
    }

    public int noderMedNokMinne(int paakrevdMinne) {
        int antNoder = 0;
        for (Rack rack : dataklynge) {
            antNoder += rack.noderMedNokMinne(paakrevdMinne);
        }
        return antNoder;
    }

    public int antRacks() {
        int racks = dataklynge.size();
        return racks;
    }
}

/*
Siste jobbet med:

*/

