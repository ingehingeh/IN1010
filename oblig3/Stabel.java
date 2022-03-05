// IN1010 oblig 3: Lenkelister

/*
C1: Skriv klassen Stabel<T>. Klassen skal arve fra Lenkeliste<T>, men den
skal redefinere metoden leggTil(T x) slik at nye elementer legges først i listen
*/

class Stabel<T> extends Lenkeliste<T> {

    // legger til i starten av listen (Stack)
    @Override
    public void leggTil(T x) {
        Node nyNode = new Node(x);
        
        if (start == null) { // om tom liste
            start = nyNode;
        } 
        else {               // om liste med flere elementer
            nyNode.forrige = null;
            nyNode.neste = start;
        }
        start = nyNode;
        stoerrelse += 1;
      } // FERDIG

  }
  