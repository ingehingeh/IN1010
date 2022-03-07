public class TestAListe {

    private static int antallTester = 0;
    private static int antallPasserte = 0;
    private static int antallFeil = 0;

    public static void main(String[] args) {
        testTomListe();
        testEtElement();
        testSettInnOgFjernFlereVerdier();
        testSettOgSettAlle();
        testHarNokkel();
        testAListUnik();
        
        System.out.println("\n"+ antallTester + " tester ferdig");
        System.out.println(antallPasserte + " passerte, " + antallFeil + " feil");
    }

    public static void testTomListe() {
        System.out.println("Test tom liste");
        AListe<String,String> liste = new AListe<>();
        sjekk(0, liste.stoerrelse(), "stoerrelse() i tom liste");
    }

    public static void testEtElement() {
        System.out.println("\nTest ett element");
        AListe<Integer,String> liste = new AListe<>();
        liste.settInn(0, "null");
        sjekk(1, liste.stoerrelse(), "stoerrelse() i liste med ett element");
        sjekk("null", liste.hent(0), "hent(0) i liste med ett element");
        sjekk("null", liste.fjern(0), "fjern(0) i liste med ett element");
        sjekk(0, liste.stoerrelse(), "stoerrelse() i tom liste");
    }

    public static void testSettInnOgFjernFlereVerdier() {
        System.out.println("\nTest settInn() og fjern() med flere elementer");
        AListe<Integer,String> liste = new AListe<>();
        liste.settInn(0, "null");
        liste.settInn(1, "en");
        liste.settInn(2, "to");
        liste.settInn(4, "fire");
        sjekk(4, liste.stoerrelse(), "stoerrelse() i liste med 4 elementer");
        sjekk("fire", liste.hent(4) , "hent(4) i liste med 4 elementer");
        sjekk("null", liste.hent(0) , "hent(0) i liste med 4 elementer");
        sjekk("en", liste.hent(1) , "hent(1) i liste med 4 elementer");
        sjekk("to", liste.fjern(2), "fjern(2) i liste med 4 elementer");
        sjekk(3, liste.stoerrelse(), "stoerrelse() i liste med 3 elementer");
        sjekk(null , liste.fjern(10), "fjern(10) i liste med 3 elementer");
        sjekk("fire" , liste.fjern(4), "fjern(4) i liste med 3 elementer");
        sjekk(2, liste.stoerrelse(), "stoerrelse() i liste med 2 elementer");
    }

    public static void testSettOgSettAlle() {
        System.out.println("\nTest sett() og settAlle() med flere elementer");
        AListe<Integer,String> liste = new AListe<>();
        liste.settInn(0, "null");
        liste.settInn(1, "en");
        liste.settInn(2, "to");
        liste.settInn(2, "to");
        liste.settInn(3, "tre");
        liste.settInn(3, "tre");
        
        liste.sett(2, "two");
        sjekk("two", liste.hent(2), "sett(2) i liste med 6 elementer");
        sjekk("two", liste.fjern(2), "fjern(2) i liste med 6 elementer");
        sjekk("to", liste.hent(2), "sett(2) i liste med 5 elementer");

        liste.settAlle(3, "three");
        sjekk("three", liste.hent(3), "sett(2) i liste med 6 elementer");
        sjekk("three", liste.fjern(3), "fjern(2) i liste med 6 elementer");
        sjekk("three", liste.hent(3), "sett(2) i liste med 5 elementer");
    }

    public static void testHarNokkel() {
        System.out.println("\nTest sett() og settAlle() med flere elementer");
        AListe<Integer,String> liste = new AListe<>();
        liste.settInn(0, "null");
        liste.settInn(1, "en");
        liste.settInn(2, "to");
        liste.settInn(2, "to");
        liste.settInn(3, "tre");
        liste.settInn(3, "tre");

        sjekk(true, liste.harNokkel(0), "harNokkel(0) i liste med 6 elementer");
        sjekk(false, liste.harNokkel(10), "harNokkel(10) i liste med 6 elementer");
        sjekk("null", liste.fjern(0), "fjern(0) i liste med 6 elementer");
        sjekk(false, liste.harNokkel(0), "harNokkel(0) i liste med 6 elementer");
    }

    public static void testAListUnik() {
        System.out.println("\nTest AListeUnik");
        AListe<Integer,String> liste = new AListeUnik<>();
        try {
            liste.settInn(0, "null");
            sjekkPasserte();
        } catch (HarNokkel e) {
            sjekkFeilet("Skal kunne sett inn i en tom AListeUnik");
        }
        try {
            liste.settInn(0, "null");
            sjekkFeilet("Skal ikke kunne sette inn samme element flere ganger i AListUnik");
        } catch (HarNokkel e) {
            sjekkPasserte();
        }
        try {
            liste.settInn(1, "en");
            sjekkPasserte();
        } catch (HarNokkel e) {
            sjekkFeilet("Skal kunne sett inn et nokkel som ikke eksisterer fra før i AListUnik");
        }
        try {
            liste.settInn(1, "en");
            sjekkFeilet("Skal ikke kunne sette inn samme element flere ganger i AListUnik");
        } catch (HarNokkel e) {
            sjekkPasserte();
        }
    }

    public static void sjekk(Object forventet, Object faktisk, String testmelding) {
        if(forventet == null) {
            if(faktisk == null) sjekkPasserte();
            else {
                sjekkFeilet(testmelding);
                System.out.println("  > Forventet verdi: " + forventet);
                System.out.println("  > Faktisk verdi: " + faktisk);
            }

        } else {
            if (forventet.equals(faktisk)) {
                sjekkPasserte();
            } else {
                sjekkFeilet(testmelding);
                System.out.println("  > Forventet verdi: " + forventet);
                System.out.println("  > Faktisk verdi: " + faktisk);
            }
        }
    }

    public static void sjekkPasserte() {
        antallTester++;
        antallPasserte++;
        System.out.println("- Test " + antallTester + ": OK");
    }

    public static void sjekkFeilet(String testmelding) {
        antallTester++;
        antallFeil++;
        System.out.println("- Test " + antallTester + " feilet: " + testmelding);
    }
    
}
