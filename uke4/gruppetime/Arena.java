// gruppetime 03.02.22
// Squirtle er subklasse av Pokemon

class Arena {

    public static void main(String[] args){

        Squirtle jonas = new Squirtle("Jonas", 10, 5);
        Blastois elise = new Blastois("Elise", 11, 12, "WOOHA");

        Metapod daniel = new Metapod("Daniel", 10, 5);

        daniel.tackle(elise);


        daniel.tackle(elise);
        Butterfree danielEvolved = daniel.evolve();
        //daniel.fly();

        //System.out.print(danielEvolved.tackle(15));

        System.out.println(jonas.equals(elise));



        
    }
}
