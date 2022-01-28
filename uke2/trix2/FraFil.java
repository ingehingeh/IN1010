// Trix Uke 2: 02.12: Enkel lesing fra fil

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FraFil {
    public static void main(String[] args)
    throws FileNotFoundException {
        File minFil = new File("tekst.txt");
        Scanner lesFil = new Scanner(minFil);

        while (lesFil.hasNextLine()) {
            String linje = lesFil.nextLine();
            System.out.println("På linjen står det: " + linje);

        }
    }
}
