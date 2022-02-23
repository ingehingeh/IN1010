// Uke 4 Gruppetime
// Tema: Polymorfi og konstruktører i subklasser

class Metapod extends Pokemon {
    
    public Metapod(String navn, int hp, int atk) {
        this.navn = navn;
        this.hp = hp;
        this.atk = atk;
    }

    @Override
    public void tackle(Pokemon p){
        System.out.println(navn + " stirrer tomt i luften");
    }

    @Override
    public Butterfree evolve(){
        System.out.println(navn + " evolved");
        return new Butterfree(navn, hp, atk);
    }


}