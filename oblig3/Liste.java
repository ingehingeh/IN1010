// in1010 oblig 3 
// Tema: liste, lenkeliste, indeksert liste, stabel, kø, prioritetskø

interface Liste <T> {
    int stoerrelse ();
    void leggTil (T x);
    T hent ();
    T fjern ();
}
    