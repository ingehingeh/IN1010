// IN1010 oblig 3: Lenkelister// Underveis testing

public class DivTester {
    public static void main(String[] args) {

/*
        Lenkeliste<Integer> l = new Lenkeliste<>();

        System.out.println("LENKELISTE: Legger til 0,11,22,33");
        l.leggTil(0);
        l.leggTil(11);
        l.leggTil(22);
        l.leggTil(33);
        System.out.println(l.toString());

        System.out.print("l.hent(0) = " + l.hent() + "\n");
        System.out.print("fjern(0) = " + l.fjern() + "\n");
        System.out.print("l.hent(11) = " + l.hent() + "\n");
        System.out.print("fjern(11) = " + l.fjern() + "\n");

        System.out.println(l.toString() + "\n---------------------");

        

        Stabel<Integer> s = new Stabel<>();

        System.out.println("STABEL: Legger til 0,11,22,33");
        s.leggTil(0);
        s.leggTil(11);
        s.leggTil(22);
        s.leggTil(33);
        System.out.println(s.toString());

        System.out.print("l.hent(33) = " + s.hent() + "\n");
        System.out.print("fjern(33) = " + s.fjern() + "\n");
        System.out.print("l.hent(22) = " + s.hent() + "\n");
        System.out.print("fjern(22) = " + s.fjern() + "\n");

        System.out.println(s.toString() + "\n---------------------");

        Koe<Integer> k = new Koe<>();

        System.out.println("KOE: Legger til 0,11,22,33");
        k.leggTil(0);
        k.leggTil(11);
        k.leggTil(22);
        k.leggTil(33);
        System.out.println(k.toString());

        System.out.print("l.hent(0) = " + k.hent() + "\n");
        System.out.print("fjern(0) = " + k.fjern() + "\n");
        System.out.print("l.hent(11) = " + k.hent() + "\n");
        System.out.print("fjern(11) = " + k.fjern() + "\n");

        System.out.println(k.toString() + "\n---------------------");



        IndeksertListe<Integer> i = new IndeksertListe<>();

        System.out.println("IndeksertListe: Legger til 0,11,22,33");
        i.leggTil(0, 0);
        i.leggTil(1, 11);
        i.leggTil(2, 22);
        i.leggTil(1, 999);
        //i.leggTil(1, 33);
        System.out.println(i.toString());

        //i.sett(0, 999);

        System.out.print("l.hent(0) = " + i.hent(0) + "\n");
        System.out.print("fjern(0) = " + i.fjern(0) + "\n");
        System.out.print("l.hent(22) = " + i.hent(2) + "\n");
        System.out.print("fjern(22) = " + i.fjern(2) + "\n");

        System.out.println(i.toString() + "\n---------------------");
*/
        
        Prioritetskoe<Integer> p = new Prioritetskoe<>();

        System.out.println("Prioritetskoe: Legger til 0,11,22,33");
        p.leggTil(0);
        p.leggTil(11);
        p.leggTil(22);
        p.leggTil(999);
        p.leggTil(33);
        System.out.println(p.toString());

        //p.sett(0, 999);

        System.out.print("l.hent(0) = " + p.hent() + "\n");
        System.out.print("fjern(0) = " + p.fjern() + "\n");
        System.out.print("l.hent(3noe) = " + p.hent() + "\n");
        System.out.print("fjern(3noe) = " + p.fjern() + "\n");
      
        
    }
}