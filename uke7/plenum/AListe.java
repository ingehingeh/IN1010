import java.util.Iterator;
import java.lang.*;

public class AListe<K,V> implements Iterable<K>{
    
    protected Node forste, siste;
    private int stoerrelse = 0;

    protected class Node {
        Node neste, forrige;
        K nokkel;
        V verdi;

        public Node(K nokkel, V verdi){
            this.nokkel = nokkel;
            this.verdi = verdi;
        }
    }

    public void settInn(K nokkel, V verdi){
        Node nyNode = new Node(nokkel, verdi);
        stoerrelse++;
        if(siste == null) {
            forste = nyNode;
            siste = nyNode;
            return;
        }
        siste.neste = nyNode;
        nyNode.forrige = siste;
        siste = nyNode;
    }

    public int stoerrelse(){
        return stoerrelse;
    }

    public V hent(K nokkel){
        Node tmp = forste;
        while(tmp != null && !tmp.nokkel.equals(nokkel)){
            tmp = tmp.neste;
        }
        if(tmp == null) return null;
        return tmp.verdi;
    }

    public V fjern(K nokkel){
        if (nokkel.equals(forste.nokkel)){
            V verdi = forste.verdi;
            forste = forste.neste;

            if(forste != null){
                forste.forrige = null;
            }
            else {
                siste = null;
            }
            stoerrelse--;
            return verdi;
        }

        Node tmp = forste;
        while(tmp != null && !tmp.nokkel.equals(nokkel)){
            tmp = tmp.neste;
        }

        if (tmp == null) return null;

        V verdi = tmp.verdi;
        stoerrelse--;
        if(tmp == siste){
            siste = siste.forrige;
            siste.neste = null;
            return verdi;
        }

        tmp.forrige.neste = tmp.neste;
        tmp.neste.forrige = tmp.forrige;
        return verdi;

    }

    public void sett(K nokkel, V verdi){
        Node tmp = forste;
        while(tmp != null && !nokkel.equals(tmp.nokkel)){
            tmp = tmp.neste;
        }
        if (tmp != null) {
            tmp.verdi = verdi;
        }
    }

    public void settAlle(K nokkel, V verdi){
        Node tmp = forste;
        while(tmp != null){
            if(nokkel.equals(tmp.nokkel)){
                tmp.verdi = verdi;
            }
            tmp = tmp.neste;
        }
    }

    public boolean harNokkel(K nokkel){
        Node tmp = forste;
        while(tmp != null){
            if(tmp.nokkel.equals(nokkel)) return true;
            tmp = tmp.neste;
        }
        return false;
    }


    @Override
    public String toString() {
        String string = "";

        Node tmp = forste;
        while(tmp != null){
            string += "(NOKKEL: " + tmp.nokkel + "| VERDI: " + tmp.verdi + ") -->";
            tmp = tmp.neste;
        }
        return string;
    }

    @Override
    public Iterator<K> iterator() {
        return new AListeIterator();
    }

    public class AListeIterator implements Iterator<K> {
        private Node tmp = forste;

        @Override
        public K next(){
            K nokkel = tmp.nokkel;
            tmp = tmp.neste;
            return nokkel;
        }

        @Override
        public boolean hasNext(){
            return tmp != null;
        }
    }
}
