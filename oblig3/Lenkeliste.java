// in1010 oblig 3 
// Tema: liste, lenkeliste, indeksert liste, stabel, kø, prioritetskø
/*
B1: Skriv hele klassen Lenkeliste<T> som implementerer Liste<T> med en
lenket liste. Nye elementer settes inn på slutten av listen og tas ut fra starten
slik at det elementet som ble satt inn først, er det første som blir tatt ut.
*/

import java.lang.RuntimeException;

// må gjøres abstract senere
public class Lenkeliste <T> {
    // implements Liste<T> må legges til

    // Intern klasse (brukes bare inne i Lenkeliste)
    private class Node {
        Node neste = null; //peker til neste node
        Node forrige = null;
        private T x; // Type objekt
        Node(T x){
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

    // @Override
    // ### MÅ ENDRES ########################
    // legger til på slutten av listen (endre til start av liste)
    public void leggTil(T x) {
      Node ny = new Node(x);
      if (start == null) {
        start = ny;
      } else {
        ny.forrige = slutt;
        slutt.neste = ny;
      }
      slutt = ny;
      stoerrelse += 1;
    }

    // @Override ### MÅ ENDRES ########################
    // Metoden hent() skal returnere det første elementet i listen,
    // men det skal ikke fjernes fra listen.
    public T hent(int pos) throws UgyldigListeIndeks {
        if (pos > stoerrelse - 1 || pos < 0) { //hvis ikke mulig
          throw new UgyldigListeIndeks(pos);
        }
        Node peker = peker(pos); //henter peker til pos
        return peker.x;
      }

    // @Override ### MÅ ENDRES ########################
    // Metoden fjern() skal fjerne det første elementet i listen
    // og returnere det.
    public T fjern() throws UgyldigListeIndeks{
      if (stoerrelse == 0) {
        throw new UgyldigListeIndeks(0);
      }
      T returverdi = start.x;
      if (stoerrelse == 1) {
        slutt = null;
        start = null;
      } else {
        start.neste.forrige = null;
        start = start.neste;
      }
      stoerrelse -= 1;
      return returverdi;
    }



    // ### MÅ ENDRES ########################
    //returnerer peker til Noden på pos, hvis ikke returnerer null
    public Node peker(int pos) {
        if (pos > stoerrelse - 1 || pos < 0) { //hvis ikke mulig
          return null;
        } else if (pos == 0) {
          return start;
        } else if (pos == stoerrelse) {
          return slutt;
        } else {
          Node peker = start;
          for (int i = 0; i < pos; i ++) {
            peker = peker.neste;
          }
          return peker;
        }
      }

    // ### MÅ ENDRES ########################
    public String toString() {
        String str = "";
        str += "Antall noder: " + stoerrelse;
        str += "\nInnhold:";
        Node peker = start;
        for(int i = 0; i < stoerrelse; i++) {
          str += "\n  pos = " + String.valueOf(i) + ", data = ";
          if (i != 0) {
            peker = peker.neste;
          }
          str += peker.toString();
        }
        return str;
      }


}
