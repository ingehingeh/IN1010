import java.util.Scanner;

/* Klasse skal være i fil <klassenavn>.java
    Dette er forresten en flerlinjet kommentar */

    class Hovedprogram  {
        public static void main(String[] args) {
            int a = 3;
            double b = 3.3;
            String c = "Hei"; // "" om string
            char d = 'd'; // '' om en character
            int[] e = {1,2,3};
            // f må lages vha HashMap i Java(senere)

            for (int i=0; i<10; i++) {
                System.out.println("Tallet er" + i);
            }
            for (int j:e) {
                System.out.println(j);
            }
            while (a < 4) {
                System.out.println(a);
                a++; // kan også a += 1
            }
            // ref. import java.util.Scanner
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.next();
            // kan bruke scanner.nextInt()
            // eller scanner.nextDouble()
            int int_inp = Integer.parseInt(inp);
            double double_inp = Double.parseDouble(inp);
        }
    }
    // Trenger ikke kalle på noe
    // Kjøring starter i main i klassen med navn som filen

    // Klassen A skal være i en egen fil som heter A.java
        