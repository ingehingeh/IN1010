public class Test {
    
    public static void main(String[] args) {
        //ArrayListe<String> listeAvString = new ArrayListe<>();
        /*AListe<Integer,String> liste = new AListe<>();
        System.out.println("Storrelse(0): " + liste.stoerrelse());
        liste.settInn(1, "en");
        System.out.println("Storrelse(1): " + liste.stoerrelse());
        liste.settInn(2, "two");
        System.out.println(liste);
        System.out.println("Storrelse(2): " + liste.stoerrelse());

        liste.sett(2, "to");
        liste.settInn(1, "one");
        liste.settAlle(1, "nyEN");
        liste.sett(10, "ti");
        System.out.println(liste);
        System.out.println(liste.hent(2));
        System.out.println(liste.harNokkel(1));*/

        /*AListeUnik<Integer, String> unik = new AListeUnik<>();
        unik.settInn(2, "to");
        unik.settInn(1, "en");
        unik.settInn(3, "tre"); 

        for (Integer i : unik){
            System.out.println(i);
        } */

        Dato d = new Dato(18, 2, 1990);
        Dato d2 = new Dato(26, 3, 1998);

        //System.out.println(d2.equals(d));

        AListeSortert<Dato, String> sortert = new AListeSortert<>();
        sortert.settInn(d2, "Marlen");
        sortert.settInn(d, "philip");
        sortert.settInn(new Dato(19,2,1990), "Kari");
        System.out.println(sortert);
        
        /*AListe<String,String> ordbok = new AListe<>();
        ordbok.settInn("two", "to");
        //ordbok.settInn(1, "one");
        System.out.println(ordbok);*/

    }
}
