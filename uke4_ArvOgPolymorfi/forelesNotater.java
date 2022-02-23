// Forelesning 8. Feb 
// polymorfi
// konstruktører i subklasser


// Om har samme metode i superklasse og subklasse = bruker nederste subklassen sin metode
// Selv om pekeren peker på øverste delen av objektet
// Får skrevet ut taxi-skatt, ikke superklase Bil sin skatt
// @Override 

// ikke lov å endre metoder med 'final'

// Endre/Legge til ekstra på subklasse metoder
// i subklassen

@Override
public void skrivData () {
    super.skrivData(); // bruker metoden fra superklassen, og legger til ekstra under
    System.out.println("ekstra info for subklasse")
}

// Overload = metodenavn er likt, men ulik signatur

// instanceof = finner ut hvilken klasse et objekt er
// prøv heller å bruke polymorfi enn instanceof

// Bruke Arv eller Komposisjon?
// Har relasjoner:
//- Student "er en" Person = Bruk Arv(subklasser)
//- Kapittel ""er del av" Bok = Bruk Komposisjon

// Alt er objekter og objekt-klassen har vanlige metoder:
// toString() = return String av objektet (Fin test-metode)
// equals() = boolean, sjekker om 2 objekter er like (dårlig definert originalt)
// hashCode() = return en hash-verdi av objektet


// Konstruktør når vi bruker arv(subklasser)
super(); // = kaller på superklassen sin konstruktør, eller
super(5, "test");

// 3 Regler må kunne: (VELDIG VIKTIG, lysark44 i Foreles 8. Februar)
// 1) Kall på superklassen sin konstruktør = Må ligge først/øverst i subklasse konstruktøren
// 2) Kaller man ikke super eksplisitt, kaller Java super() først i konstruktør på egenhånd
// 3) Klasse uten konstruktør = Legger Java in en tom konstruktør med kall på super()

// Om bruker ulike konstruktører i super og subklasser = Kan lage flere konstruktører i en klasse
// Da vil automatisk passende konstruktøren kalles (med/uten argumenter)