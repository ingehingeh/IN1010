// IN1010 oblig 4 gruppearbeid:
// Del B: Itererbare lister

import java.util.Iterator;
import java.util.NoSuchElementException;

// IN1010 oblig 3: Lenkelister

public abstract class Lenkeliste<T> implements Liste<T> {

    // intern klasse i Lenkeliste
    protected class Node {
        Node neste = null; 
        Node forrige = null;
        protected T x; // Type objekt
        Node(T x) {
            this.x = x;
        }
        public String toString() {
            return x.toString();
        }
    }
  
    protected Node start = null;
    protected Node slutt = null;
    protected int stoerrelse = 0;
  
    public int stoerrelse() {
        return stoerrelse;
    }
  
    // legger til paa slutten av listen
    public void leggTil(T x) {
      Node nyNode = new Node(x);
        
      if (start == null) { // om tom liste
        start = nyNode;
      } 
      else { // om liste med elementer
        nyNode.forrige = slutt;
        slutt.neste = nyNode;
      }
      slutt = nyNode; // oppdaterer ny slutt-node
      stoerrelse += 1;
      }
  
    // henter foerste element i listen
    public T hent() {
      if (start == null) { // om tom liste
        System.out.println("Tom liste");
        return null;
      } else return start.x;
    }
  
    // fjerner foerste element i listen
    public T fjern() throws UgyldigListeindeks{
      if (stoerrelse == 0) { // kaster exception om tom liste
        throw new UgyldigListeindeks(0);
      }
      T fjernes = start.x;
      if (stoerrelse == 1) {  // om liste med ett element
        slutt = null;
        start = null;
      } else {                // om liste med flere elementer
        start.neste.forrige = null;
        start = start.neste;
      }
      stoerrelse -= 1;
      return fjernes;
      }
  
    // hent peker til node på gitt posisjon, ellers null
    public Node peker(int pos) {
        if (0 > pos || pos > stoerrelse-1) { // om feil posisjon
          return null;
        } 
        else if (pos == 0) {
          return start;
        } 
        else if (pos == stoerrelse) {
          return slutt;
        } 
        else {
          Node peker = start;
          // itererer frem til peker ved gitt posisjon
          for (int i = 0; i < pos; i ++) {
            peker = peker.neste;
          }
          return peker;
        }
      }
  
    // itererer gjennom listen og returnerer en string
    // med indeks + verdi
    public String toString() {
        String info = "Ant noder: " + stoerrelse + "\nIndeks | Element(x)\n";
  
        Node tmp = start;
        for(int i = 0; i < stoerrelse; i++) { // iterer gjennom listen
          info += String.valueOf(i) + ": ";
          if (i != 0) {
            tmp = tmp.neste;
          }
          info += tmp.toString() + "\n"; // returner element-verdi
        }
        return info;
      }

    // Nytt i oblig 4 ----------------------------------------------

    // Del B: implementerer Iterable
    public LenkelisteIterator<T> iterator() {
      return new LenkelisteIterator();
    }

    private class LenkelisteIterator implements Iterator<T> {
        Node current = start;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() { // henter data og flytter current-node et steg videre
            if (current == null) throw new NoSuchElementException("next");
            Node tmp = current;
            current = current.neste;
            return tmp.data;
        }
    }
  
  }
  

// uke 7 gruppetime-----------------------------------------------------------------

class Lenkeliste<T> implements Iterable<T> {
    Node start;

    private class Node {
        T data;
        Node neste;
        public Node(T d) {
            data = d;
        }
    }

    public boolean empty(){
        return start == null;
    }

    public void add(T data){
        Node n = new Node(data);
        if (empty()) {
            start = n;
        }
        else {
            Node tmp = start;
            while(tmp.neste != null){
                tmp = tmp.neste;
                }
            tmp.neste = n;
            }
        }

        public T pop() { // henter 1. element-data og fjerner 1. node
            if (empty()) {
                System.out.println("Empty list");
            }
            Node tmp = start;
            start = start.neste;
            return tmp.data;
        }

        public void print() {
            // bare en fancy for loop for demonstrasjon
            for (Node tmp = start; tmp != null; tmp=tmp.neste){
                System.out.println(tmp.data);
            }
        }

        public Iterator<T> iterator(){
            return new Xerator();
        }

        private class Xerator implements Iterator<T> {
            Node current = start;

            @Override
            public boolean hasNext(){
                return current != null;
            }

            @Override
            public T next() {
                if (current == null) throw new NoSuchElementException("next");
                Node tmp = current;
                current = current.neste;
                return tmp.data;
            }
        }

}