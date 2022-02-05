// IN1010 vår 22 oblig 1: Dataklynge
// Klasse for representasjon av dataklynge i et datasenter.

import java.util.ArrayList;

class Dataklynge {
    private int noderPerRack; // maks 12 noder per Rack
    private ArrayList<Rack> dataklynge = new ArrayList<> ();

    // Oppretter en regneklynge og setter maks antall noder
    // det er plass til i et rack
    // @param noderPerRack max antall noder per rack
    public Dataklynge(int noderPerRack) {
        this.noderPerRack = noderPerRack;
    }

    // Plasserer et node-objekt inn i et rack med ledig plass, eller i et nytt
    // @param node referanse til noden som skal settes inn i datastrukturen
    public void settInnNode(Node node) {
        // om ingen racks lages nytt rack
        if (dataklynge.size() == 0) {
            Rack nyRack = new Rack(noderPerRack);
            dataklynge.add(nyRack);
        }
        // om siste rack fullt lages nytt rack
        Rack lastRack = dataklynge.get(dataklynge.size() - 1); // get last Rack
        if (lastRack.getAntNoder() == noderPerRack) {
            dataklynge.add(new Rack(noderPerRack));
        }
        // setter inn node
        for (Rack rack : dataklynge) {
            if (rack.getAntNoder() < noderPerRack) {
                rack.settInn(node);
            }
        }
    }

    // egen test metode
    public void skrivUtDataklynge() {
        for (Rack rack : dataklynge) {
            System.out.println(rack + "----");
            rack.skrivUtRack();
            System.out.println("---------------");
        }
    }

    // Beregner totalt antall prosessorer i hele regneklyngen
    // @return totalt antall prosessorer
    public int antProsessorer() {
        int dataklyngeProsessorer = 0;
        for (Rack rack : dataklynge) {
            dataklyngeProsessorer += rack.antProsessorer();
        }
        return dataklyngeProsessorer;
    }

    // Beregner antall noder i regneklyngen med minne over angitt grense
    // @param paakrevdMinne hvor mye minne skal noder som telles med ha
    // @return antall noder med tilstrekkelig minne
    public int noderMedNokMinne(int paakrevdMinne) {
        int antNoder = 0;
        for (Rack rack : dataklynge) {
            antNoder += rack.noderMedNokMinne(paakrevdMinne);
        }
        return antNoder;
    }

    // Henter antall racks i regneklyngen
    // @return antall racks
    public int antRacks() {
        int racks = dataklynge.size();
        return racks;
    }
}

/*
Siste jobbet med:

*/

