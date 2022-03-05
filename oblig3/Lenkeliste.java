// IN1010 oblig 3: Lenkelister

/*
B1: Skriv hele klassen Lenkeliste<T> som implementerer Liste<T> med en
lenket liste. Nye elementer settes inn på slutten av listen og tas ut fra starten
slik at det elementet som ble satt inn først, er det første som blir tatt ut.
*/

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
    } // FERDIG

  // henter foerste element i listen
  public T hent() {
    if (start == null) { // om tom liste
      System.out.println("Tom liste");
      return null;
    } else return start.x;
  } // FERDIG


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
    } // FERDIG

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
    } // FERDIG

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
    } // FERDIG

} // FERDIG
