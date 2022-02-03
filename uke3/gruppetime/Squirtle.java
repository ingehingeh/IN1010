// gruppetime 03.02.22
// Squirtle er subklasse av Pokemon

class Squirtle extends Pokemon {


    public Squirtle(String navn, int hp, int atk){
        this.navn = navn;
        this.hp = hp;
        this.atk = atk;
    }
    
    public void regen(){
        hp += atk;
        System.out.println(navn + "Bruker regen");
    }

}