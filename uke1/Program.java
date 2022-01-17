class Program {
    public static void main (String[] args) {
        System.out.println("Dette er et Java-program");
        int tall;
        tall = 2+3;
        System.out.println("Dette er et tall: " + tall);

        // Endring her for å teste git branch, pull request, merge branch
        System.out.println("Endring her");
    }
}
// public - synlig utenfor klassen
// static - metoden finnes før vi har laget objekter
// void - metode/prosedyre som ikke skal returnere noe (returtype)

// System.out.print() - print uten linjeskift (kanskje vil ha mer på samme linje)
// System.out.println() - print med linjeskift

/* Feilmelding (Multi linje kommentar)
> javac Program.java
Program.java:5: error: cannot find symbol
        System.out.println("Dette er et tall", tall);
                                               ^
  symbol:   method str(int)
  location: class Program
1 error
-------------------
Lesing av feilmelding:
Program.java:5 = Feil på linje 5
error: cannot find symbol = Java skjønner ikke 'str'
*/

/* For å kompilere å kjøre java program gjør vi følgende:
> javac [filnavn.java] = kompilerer programmet 
        (oversetter til noe pc forstår/kan kjøre (byte-kode))
> java [bare klassenavn] = Kjører klassenavnet vi ønsker

> javac Program.java = kompilerer programmet (oversetter til noe pc forstår/kan kjøre)
> java Program = Kjører klassenavnet vi ønsker
*/