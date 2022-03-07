
public class AListeSortert<K extends Comparable<K>,V> extends AListe<K,V> {

    @Override
    public void settInn(K nokkel, V verdi){
        if(siste == null || nokkel.compareTo(siste.nokkel) > 0) {
            super.settInn(nokkel, verdi);
            return;
        }

        //System.out.print("Heii lol")
        Node nyNode = new Node(nokkel, verdi);
        if(nokkel.compareTo(forste.nokkel) < 0) {
            nyNode.neste = forste;
            forste.forrige = nyNode;
            forste = nyNode;
            return;
        }

        Node tmp = forste.neste;
        while(tmp.nokkel.compareTo(nokkel) < 0){
            tmp = tmp.neste;
        }

       // Node tmpForrgie = tmp.forrige;
        tmp.forrige.neste = nyNode;
        nyNode.forrige = tmp.forrige;
        nyNode.neste = tmp;
        tmp.forrige = nyNode;
    }
    
}
