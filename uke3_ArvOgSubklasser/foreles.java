// 1. Feb forelesning: Arv og subklasser
/*
# Subklasser
# Referanser til objekter av subklasser
 - Casting/typekonvertering (sterk typing)
 - Instance of (boolsk)

 Komposisjon og delegering

 # Subklasse
 class Klasse {}  (overordnet klasse kalles superklassen)
 class Subklasse extends Klasse {}
 class SubSubklasse extends Subklasse {}

 Ikke bland Klassehierarki(Enkle grener med super- og sub-klasser) med datastruktur tegn

if (abc instanceof DenneKlassen) {
    cde = (Denneklassen)efg;
}
Når vi caster feil kan vi få feilmelding: ClassCastException
Husk det når bygger Try/Catch Exceptions

protected egenskaper = kan sees nedover i subklasser
(dette kan ikke private klasser)

Deklarering av konstanter som ikke endres med 'final' (f.eks g=9.81m/s^2)
protected final int objektId

abstract class Person
abstract betyr at vi aldri kommer til å lage objekter av klassen Person
Kommer bare til å lage subklasser av Person, som Student, Ansatt, etc

*/