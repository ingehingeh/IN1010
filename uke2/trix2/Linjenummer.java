// Trix Uke 2: 02.17: Fil med linjenummer

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Linjenummer {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner lesFil = new Scanner(new File("Mary-lamb.txt"));

        int teller = 0;
        while (lesFil.hasNextLine()) {
            String linje = lesFil.nextLine();
            System.out.println("# " + teller + ": " + linje);
            teller ++;

        }
    }
}

