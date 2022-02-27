// in1010 oblig 3 
// Tema: liste, lenkeliste, indeksert liste, stabel, kø, prioritetskø

class UgyldigListeindeks extends RuntimeException {
    UgyldigListeindeks (int indeks) {
    super("Ugyldig indeks: " + indeks);
    }
}
