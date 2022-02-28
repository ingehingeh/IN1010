// in1010 oblig 3 
// Tema: liste, lenkeliste, indeksert liste, stabel, kø, prioritetskø
import java.lang.RuntimeException;


class UgyldigListeIndeks extends RuntimeException {
    UgyldigListeIndeks (int indeks) {
    super("Ugyldig indeks: " + indeks);
    }
}
