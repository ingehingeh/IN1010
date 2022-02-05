// IN1010 vår 22 oblig 1: Dataklynge
// Klasse for representasjon av noder i en dataklynge

public class Node {
    private int minne;
    private int antPros;
    
    // Oppretter en node med gitt minne-storrelse og antall prosessorer
    // @param minne GB minne i den nye noden
    // @param antPros antall prosessorer i den nye noden
    public Node(int minne, int antPros) {
        this.minne = minne;
        this.antPros = antPros;
    }

    // Henter antall prosessorer i noden
    // @return antall prosessorer i noden
    public int antProsessor() {
        return antPros;
    }
    // Sjekker om noden har tilstrekkelig minne for et program
    // @param paakrevdMinne GB minne som kreves for programmet
    // @return True hvis noden har minst så mye minne
    public boolean nokMinne(int paakrevdMinne) {
        if (paakrevdMinne <= minne) {
            return true;
        } else {
            return false;
        }
    }
}
