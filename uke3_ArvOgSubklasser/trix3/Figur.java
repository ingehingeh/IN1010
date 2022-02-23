// Trix Uke 3: 03.04: Arv av egenskaper

abstract class Figur {
    double areal;

    public double hentAreal(){
        return areal;
    }
}

class Trekant extends Figur {
    private double hoyde;
    private double grunnlinje;
    
    public Trekant(double hoyde, double grunnlinje) {
        this.hoyde = hoyde;
        this.grunnlinje = grunnlinje;
    }
    public double areal() {
        return (grunnlinje*hoyde)/2;
    }

}
class Sirkel extends Figur {
    private double radius;

    public Sirkel(double r) {
        radius = r;
    }

    public double areal() {
        return radius*radius*Math.PI;
    }

}
class Rektangel extends Figur {
    private double hoyde;
    private double bredde;

    public Rektangel(double b, double h) {
        bredde = b;
        hoyde = h;
    }
    public double areal() {
        return hoyde*bredde;
    }

}
class Kvadrat extends Figur {
    private double side;

    public Kvadrat(double l) {
        side = l;
    }
    public double areal() {
        return side*side;
    }
}

