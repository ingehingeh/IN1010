// Trix uke 4: 04.01: Arv av egenskaper

class TestAogB{

    public static void main(String[] args) {
        B b = new B();
        A a = b;

        b.skrivKlasse();
        a.skrivKlasse();

        // siden det er lik metode i Super og Subklasse
        // brukes metoden i subklassen
        // Her i begge tilfeller
    }


}/*abstract
a) Kall på utskriftsmetoden for hver av de to pekerne. Forklar hva som skjer.
b) Kommenter vekk utskriftsmetoden fra klassen A. Hva skjer?
c) Fjern kommenteringen fra utskriftsmetoden i A, men kommenter vekk 
utskriftsmetoden fra B. Hva skjer?

a) Når vi kaller på utskriftsmetodene vil vi bruke B-objektets implementasjon av metoden. 
Derfor skriver vi ut "B" i begge tilfeller, selv om det ene objektet har en A-referanse.

b) Nå får vi en feil, fordi selv om vi ville ha brukt B-klassens implementasjon gjør det 
at vi kaller på metoden fra en A-referanse at vi forventer en skrivKlasse i A.

c) Nå vil vi skrive ut "A" fordi vi tar vekk overskrivinngen (re-implementasjonen) 
vi laget i klasse B, og vi vil derfor benytte oss av den arvede skrivKlasse-metoden fra klasse A.
*/