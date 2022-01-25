// # Tips/Metoder i klassen String
class NyttigeStringMetoder {
    public static void main(String[] args) {
        String s = " 1234 ";

        s.charAt(2); // - return char at given position
        s.equals(" 1234 "); // - return true if 2 Strings are equal
        s.substring(3,5); // - return copy of content from 3-4, as new string
        s.split(); // split string at char (e.g. whitespace)
        s.toLowerCase();
        s.toUpperCase();
        s.trim(); // remove whitespace before and after characters
        // For mer info, søk i dokumentasjon: Google; "Java 8 API String"
        
        // # Konvertering til streng (3 metoder)
        
        // 1) Legg til en tom streng
        double tall = 5.2;
        String s = "" + tall; //   (resultat av String + double = String)
        
        // 2) Bruk Double-klassen sin metode 'toString'
        double tall = 5.2;
        String s = Double.toString(tall);
        
        // 3) 2) Bruk String-klassen sin metode 'valueOf'
        double tall = 5.2;
        String s = String.valueOf(tall);

    }
   

}

