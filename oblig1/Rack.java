// IN1010 vår 22 oblig 1: Dataklynge
// Klasse for representasjon av racks i en dataklynge

public class Rack {
    // oppretter et Node rack der det senere kan plasseres noder
    Node[] rack = new Node[12]; 
    private int maksNoder; 
    
    public Rack(int maksNoder) {
        this.maksNoder = maksNoder;
    }

    // Henter antall noder i racket
    // @return antall noder
    public int getAntNoder() {
        int teller = 0;
        while (teller < maksNoder && rack[teller] != null) {
            teller += 1;
         }
        return teller;
    }

    // Egen test metode
    public void skrivUtRack() {
        for (Node node : rack) {
            System.out.println(node);
        }
    }

    // Plasserer en ny node inn i racket
    // @param node noden som skal plasseres inn
    public void settInn(Node node) {
        for (int i = 0; i < maksNoder; i++) {
            if (rack[i] == null){
                rack[i] = node;
                break; // skjønner ikke hvordan gjøre dette uten å bruke break???
                }
        }
    }
    // Beregner sammenlagt antall prosessorer i nodene i et rack
    // @return antall prosessorer
    public int antProsessorer() {
        int rackProsessorer = 0;
        for (Node node : rack) {
            if (node != null) {
                rackProsessorer += node.antProsessor();
            }
        }
        return rackProsessorer;
    }

    // Beregner antall noder i racket med minne over gitt grense
    // @param paakrevdMinne antall GB minne som kreves
    // @return antall noder med tilstrekkelig minne
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
