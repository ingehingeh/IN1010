// Trix Uke 2: 02.20: Iterere igjennom en HashMap
/*
Anta at du har et HashMap studenter, deklarert og initialisert slik:
HashMap studenter = new HashMap();
Nøkkelen er navnet til studenten. Du kan anta at Student har en .toString()-metode som henter ut navn.
*/

import java.util.HashMap;

class ItererHashMap {
    public static void main(String[] args) {
        HashMap studenter = new HashMap();

        // a)
        for (String nokkel : studenter.keySet()) {
            System.out.println(nokkel);
        }

        // b)
        for (Student student : studenter.values()) {
            System.out.println(student.toString());
        }
    }
}