// IN1010 oblig 3: Lenkelister

/*
F1: Skriv klassen Prioritetskoe<T extends Comparable<T>>. Denne listen
arver også fra Lenkeliste<T>, men vi ønsker at listen skal være sortert og
krever derfor at elementer som settes inn, skal være sammenlignbare. Kall på
leggTil(T x) skal altså sette inn elementer i sortert rekkefølge (fra minst til
størst, der minst ligger først i listen). Like elementer (dvs elementer der
compareTo(...) returnerer 0) kan ligge i vilkårlig rekkefølge. Når vi bruker
hent()- og fjern()-metodene, skal det minste elementet hentes frem og
eventuelt fjernes.
*/

class Prioritetskoe <T extends Comparable<T>> extends Lenkeliste<T> {

  // ny legg til metode med sammenligning og sortert rekkefoelge
  @Override
  public void leggTil(T x) {
      if (stoerrelse == 0) { // om tom liste, legg til som vanlig
          super.leggTil(x);
          return;
      }

      // generellet tilfellet med flere elementer
      Node peker = start;
      for (int i = 0; i < stoerrelse ; i++) {
        if (i != 0) {
          peker = peker.neste;
        }

        // "compareTo:
        // if s1 > s2, it returns positive number  
        // if s1 < s2, it returns negative number  
        // if s1 == s2, it returns 0"
        if (peker.x.compareTo(x) > 0) { // sammenligner element-verdi
          leggTil(i, x);
          return;
        }
      }
      super.leggTil(x); // om ingen stoerre, legg til på slutten
    } // FERDIG

  // legger til i gitt posisjon, forskyver resten av elementene
  public void leggTil(int pos, T x) 
  throws UgyldigListeindeks {
    Node nyNode = new Node(x);
    Node peker = peker(pos); // henter peker til oppgitt posisjon
    if (pos > stoerrelse || pos < 0) { // om feil posisjon
      throw new UgyldigListeindeks(pos);
    } 
    else if (pos == stoerrelse) { // posisjon er slutt av listen +1
      leggTil(x);
      return;
    } 
    else if (peker == null || pos == -1 || pos == 0) { // om tom liste
      nyNode.neste = start;
      start.forrige = nyNode;
      start = nyNode;
    } 
    else { // generelle tilfellet midt i en liste
      nyNode.neste = peker;
      nyNode.forrige = peker.forrige;
      peker.forrige.neste = nyNode;
      peker.forrige = nyNode;
    }
    stoerrelse += 1;
  } // FERDIG

  // henter foerste element i listen (minste element-verdi)
  public T hent() {
    return super.hent();
  } // FERDIG

 // fjerner foerste element i listen (minste element-verdi)
 public T fjern() {
  return super.fjern();
} // FERDIG

}