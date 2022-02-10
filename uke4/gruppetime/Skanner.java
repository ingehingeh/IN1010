// gruppetime 03.02.22
// 

import java.io.File;
import.java.io.FileNotFoundException;
import java.util.Scanner;

class Skanner {
    public static void main(String[] args){
        minFil("test.txt");

    public class lesFil() {
        Scanner sc = null;

        try {
            sc = new Scanner(new File(filnavn));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
        
    }
}

