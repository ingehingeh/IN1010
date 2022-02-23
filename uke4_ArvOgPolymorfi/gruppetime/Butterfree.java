public String hentNavn(){
    return navn;
}

class Butterfree extends Metapod {
    
    public Butterfree(String navn, int hp, int atk) {
        super(navn, hp, atk);
    }

    @Override
    public void tackle(Pokemon p) {
        p.taSkade(atk);
    }

    public void fly(){
        System.out.println("FLOO FLOO");
        System.out.println(navn + " fløy vekk");
    }

    // Overload = ulik input til metode
    // Reagerer ulikt avhengig av input til metode
    public void tackle(int tall) {
        System.out.println(navn + " vil tackle matte" + tall);

    }
}