// Oblig0: Oppg 3c)

class BilBruk3 {
    public static void main(String[] args) {
        
        // oppretter Bil3-objekt med bilNr
        Bil3 bilSiri;
        bilSiri = new Bil3("ABC-123"); 

        // kaller på Bil3-metoder og -prosedyrer
        bilSiri.skrivUt();
        bilSiri.hentNummer();
        System.out.println("Bruker hentNummer: " + bilSiri.hentNummer()); 
        System.out.println("--------------------------------"); 

        // oppretter Person-objekt med tilhørende eksisterende bil
        Person Siri;
        Siri = new Person("Siri", bilSiri);
        
        // kaller på Person-metode
        Siri.skrivUt();


        
    }
}