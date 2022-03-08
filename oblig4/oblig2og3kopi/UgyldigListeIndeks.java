// IN1010 oblig 3: Lenkelister

import java.lang.RuntimeException;

class UgyldigListeindeks extends RuntimeException {
    UgyldigListeindeks (int indeks) {
    super("Ugyldig indeks: " + indeks);
    }
}
