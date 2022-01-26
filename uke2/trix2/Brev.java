// Trix Uke 2: 02.05: Oversettelse av klasse fra Python til Java

// Oversett til Java
// ArrayList <Kaniner> mineKaniner = new ArrayList ();

/* Python version
class Brev:
    def __init__(self, avsender, mottaker):
        self._avsender = avsender
        self._mottaker = mottaker
        self._linjer = []

    def skrivLinje(self, linje):
        self._linjer.append(linje)

    def lesBrev(self):
        print("Hei,", self._mottaker)
        print()
        for linje in self._linjer:
            print(linje)
        print()
        print("Hilsen fra,")
        print(self._avsender)

brevet = Brev("Per Askeladd", "Espen Askeladd")
brevet.skrivLinje("Hvordan har du det?")
brevet.skrivLinje("Jeg har det bare bra!")
brevet.lesBrev()
*/

import java.util.ArrayList;

public class Brev {
    // oppretter private instansvariabler
    private String avsender;
    private String mottaker;
    // Deklarerer fleksibel ArrayList til å holde på tekst linjene
    private ArrayList<String> tekst;

    public Brev(String avsender, String mottaker) {
        this.avsender = avsender;
        this.mottaker = mottaker;
        // oppretter ArrayList til å holde på tekst linjene
        tekst = new ArrayList<String>();
    }
    // Legger input-linje til ArrayList'en
    public void skrivLinje(String linje) {
        tekst.add(linje);
    }

    // Leser gjennom brev linje for linje, med hilsener
    public void lesBrev() {
        System.out.println("Hei " + this.mottaker + "\n");
        for (String linje : this.tekst) {
            System.out.println(linje);
        }
        System.out.println("\nHilsen fra,\n" + avsender);
    }
}