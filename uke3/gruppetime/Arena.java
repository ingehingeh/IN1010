// gruppetime 03.02.22
// Squirtle er subklasse av Pokemon

class Arena {

    public static void main(String[] args){

        Squirtle jonas = new Squirtle("Jonas", 10, 5);
        Blastois elise = new Blastois("Elise", 11, 12, "WOOHA");

        jonas.tackle(elise);
        elise.HydroCannon(jonas);
        
    }
}
