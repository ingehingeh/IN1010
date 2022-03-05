// IN1010 oblig 3: Lenkelister

/*
D1: Skriv klassen Koe<T> som skal være en subklasse av Lenkeliste<T> og
som skal fungere som en kø. Finn selv ut hvilke metoder som må redefineres;
skriv disse.
*/

// Samme logikk om i Lenkeliste (first in, first out)
// så Overrider ingen metoder

class Koe<T> extends Lenkeliste<T> {

    // vanlig koe iht. Lenkeliste
    public void leggTil(T x) {
        super.leggTil(x);
    } // FERDIG

}
  