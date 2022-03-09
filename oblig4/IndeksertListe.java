// IN1010 oblig 4 gruppearbeid
// Del D: Lege

class IndeksertListe<T> extends Lenkeliste<T> {

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
  
    // overskriver verdien til gitt node
    public void sett(int pos, T x) {
        if (pos >= stoerrelse() || pos < 0) { // om feil posisjon
        throw new UgyldigListeindeks(pos);
        }
        Node node = start;
        int teller = 0;
        if (pos == 0 && node != null)  {
          start.x = x; // setter start-element til x, om pos,peker = 0
        }
        while (node != null) {
        if (teller == pos) {
            node.x = x; // overskriver element-verdien på gitt posisjon
        }
        teller++;
        node = node.neste;
        }
    } // FERDIG
  
    // henter element fra gitt posisjon
    public T hent(int pos) {
        if (pos >= stoerrelse() || pos < 0) { // kast exception om feil posisjon
        throw new UgyldigListeindeks(pos);
        }
        // sjekker om pos er 0 og noden ikke er null. Returnerer data hvis sant
        // Itererer deretter gjennom listen til teller == pos og returnerer data.
        Node node = start;
        int teller = 0;
        if (pos == 0 && node != null) { // om pos og node = 0
          return node.x;
        }
        while (node != null) { // generellet tilfellet, ikke-null noder
        if (teller == pos) {
            return node.x; // returner node-element
        }
        teller++;
        node = node.neste;
        }
        return null;
    } // FERDIG
  
    // fjerner element fra gitt posisjon
    public T fjern(int pos) 
    throws UgyldigListeindeks{
      Node peker = peker(pos); // peker til posisjonen
      if (pos > (stoerrelse-1) || pos < 0 || stoerrelse == 0) {
        throw new UgyldigListeindeks(pos);  // om feil posisjon
      } 
      else if (stoerrelse == 1) { // om 1 node
        start = null;
        slutt = null;
      } 
      else if (peker.neste == null) { // om siste node
        slutt.forrige.neste = null;
        slutt = slutt.forrige;
      } 
      else if (peker.forrige == null) { // om foerste node
        start.neste.forrige = null;
        start = start.neste;
      } 
      else { // generellet tilfellet midt i listen
        peker.neste.forrige = peker.forrige;
        peker.forrige.neste = peker.neste;
      }
      stoerrelse -= 1;
      return peker.x;
    } // FERDIG
  
  }