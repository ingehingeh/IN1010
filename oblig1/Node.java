// IN1010 vår 22 oblig oppg 1: Dataklynge
// Node

public class Node {
    private int minne;
    private int antPros;
    
    public Node(int minne, int antPros) {
        this.minne = minne;
        this.antPros = antPros;
    }

    public int antProsessor() {
        return antPros;
    }

    public boolean nokMinne(int paakrevdMinne) {
        if (paakrevdMinne <= minne) {
            return true;
        } else {
            return false;
        }
    }
}
