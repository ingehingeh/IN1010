// gruppetime 03.02.22
/* 
arv egenskaper
1 overordnet klasse, og flere under/subklasser
Overordnet=Datamaskin, subklasse=mobil,laptop,etc

*/

abstract class Pokemon {
    // protected = tilgangskontroll for subklassen
    protected String navn;
    protected int hp;
    protected int atk;
    
    public void tackle(Pokemon p){
        p.taSkade(atk);
        System.out.println(navn + "Bruker tackle");
    }

    public void taSkade(int skade){
        int gammelHp = hp;
        if (skade >= hp){
            System.out.println(navn + "svimte av");
        } else if (skade >= 0.5*hp){
            System.out.println("Det gjorde veldig vondt");
        } else {
            System.out.println("Det gjorde litt vondt");
        }
        hp -= skade;
    }
    public int getHp(){
        return hp;
    }

    public String hentNavn(){
        return navn;
    }

    abstract public Pokemon evolve();

    
    public boolean equals(Pokemon p) {
        return (p.getHp() == hp);
    }


}