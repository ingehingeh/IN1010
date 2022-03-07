public class Dato implements Comparable<Dato> {
    private int dag, maaned, aar;

    public Dato(int dag, int maaned, int aar){
        this.dag = dag;
        this.maaned = maaned;
        this.aar = aar;
    }

    @Override
    public boolean equals(Object andre){
        if(! (andre instanceof Dato)) return false;
        Dato datoAndre = (Dato) andre;
        return compareTo(datoAndre) == 0;
    }

    @Override
    public int compareTo(Dato andreDato){
        if(aar > andreDato.aar) return 1;
        if(aar < andreDato.aar) return -1;
        if(maaned > andreDato.maaned) return 1;
        if(maaned < andreDato.maaned) return -1;
        if(dag > andreDato.dag) return 1;
        if(dag < andreDato.dag) return -1;
        return 0;
    }

    @Override
    public String toString(){
        return dag + "." + maaned + "." + aar;
    }
}
