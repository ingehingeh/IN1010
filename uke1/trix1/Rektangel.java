// 01.08: Rektangel

class Rektangel {

    double lengde;
    double bredde;

    public Rektangel(double l, double b) {
        lengde = l;
        bredde = b;
    }

    public void oekLengde(int oekning) {
        lengde = lengde + oekning;
        // lengde += oekning
    }
    public void oekBredde(int oekning) {
        bredde = bredde + oekning;
    }

    public void reduserLengde(int reduksjon) {
        if (lengde - reduksjon < 1) {
            System.out.println("Obs: Kan ikke redusere lengde så mye");
        }
        else {
            lengde -= reduksjon;
        }
    }

    public void reduserBredde(int reduksjon) {
        if (bredde - reduksjon < 1) {
            System.out.println("Obs: Kan ikke redusere bredde så mye");
        }
        else {
            bredde -= reduksjon;
        }
    }

    public double areal(){
        return lengde * bredde;
    }

    public double omkrets(){
        return 2*lengde + 2*bredde;
    }
}