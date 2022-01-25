// Foreles 24.01.22: Skrive til fil

import java.io.PrintWriter;
import java.io.FileNotFoundException;

class SkrivTilFil {
    public static void main(String[] args)
    throws FileNotFoundException {
        PrintWriter utfil = new PrintWriter("utfil.txt");
        utfil.println("Linje 1");
        utfil.close();
    }
    }
