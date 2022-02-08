// Trix Uke 3: 03.04: Arv av egenskaper

class Figurer {
    public static void main(String[] args) {
        Trekant trekant = new Trekant(3,2);
        Sirkel sirkel = new Sirkel(3);
        Rektangel rektangel = new Rektangel(3,7);
        Kvadrat kvadrat = new Kvadrat(4);

        double totAreal = (trekant.areal() + )/4;
        System.out.println();
        
    }
}

abstract class Former {
    double areal;

    public double hentAreal(){
        return areal;
    }

}
class Trekant extends Former {
    double grunnlinje;
    double hoyde;

    public Trekant(grunnlinje, hoyde) {
        this.grunnlinje = grunnlinje;
        this.hoyde = hoyde;
    }

}
class Sirkel extends Former {
    double radius;

}
class Rektangel extends Former {
    double lengde;
    double bredde;

}
class Kvadrat extends Former {
    double lengde;
}