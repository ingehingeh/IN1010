// gruppetime 03.02.22
// Squirtle er subklasse av Pokemon
// Blastoise er subklasse av Squirtle
/*
polymorfi = endrer/modifiserer metodene som arves
*/

class Blastois extends Squirtle{

    String kamprop;

    public Blastois(String navn, int hp, int atk, String kamprop){
        super(navn, hp, atk);
        this.kamprop = kamprop;
    }

    public void HydroCannon(Pokemon p){
        System.out.println(navn + "Bruker HydroCannon på" + p.hentNavn());
        p.taSkade(2*atk);
        System.out.println(kamprop);
    }

}