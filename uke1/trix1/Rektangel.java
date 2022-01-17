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
        lengde -= reduksjon;
    }

    public void reduserBredde(int reduksjon) {
        bredde -= reduksjon;
    }

    public double areal(){
        return lengde * bredde;
    }

    public double omkrets(){
        return 2*lengde + 2*bredde;
    }
}