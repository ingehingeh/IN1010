// in1010 oblig 3 
// Tema: liste, lenkeliste, indeksert liste, stabel, kø, prioritetskø
// Underveis testing

public class DivTester {
    public static void main(String[] args) {

        
        Lenkeliste<Integer> l = new Lenkeliste<>();

        System.out.println("Legger til 0,1,2,3");
        l.leggTil(0);
        l.leggTil(1);
        l.leggTil(2);
        l.leggTil(3);
        System.out.println(l.toString());

        System.out.print("l.hent(2) = " + l.hent(2) + "\n");
        
        System.out.print("fjern() = " + l.fjern() + "\n");
        System.out.println(l.toString());

      
        
    }
}