// Uke 4 Gruppetime
// Tema: Polymorfi og konstruktører i subklasser

class Phillip extends Person {

    // Overkjører/endrer metoden siHei
    // må ikke ha Override, men god konvensjon som sjekker om vi faktisk overskriver en metode
    @Override 
    public void siHei() {
        System.out.println("Hei, jeg heter Phillip");
    }
}
