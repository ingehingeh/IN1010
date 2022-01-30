// Trix Uke 2: 02.15: Enkelt køsystem

/* Kølapp system med klasser:
KoLapp - Skal ha en unikt nummer som sier når den ble trukket.
KoSystem - Skal kunne lage nye kølapper, etc
KoProgram - Skal ha en main-metode og en ordreløkke.
*/

public class KoLapp{
    private int nummer = 0;

    //Konstruktor
    public KoLapp(int nummer){
        this.nummer = nummer;
    }

    //Returnerer et tildelt nummer paa kolappen.    
    public int hentNummer(){
        return nummer;
    }
}
