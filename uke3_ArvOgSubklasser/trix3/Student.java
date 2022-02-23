// gruppetime 03.02.22
// Squirtle er subklasse av Pokemon

class Student {
    private String navn;
    private int alder;

    public Student(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    public String hentNavn() {
        return navn;
    }

    public int hentAlder() {
        return alder;
    }

    public void siNoe(String noe) {
        System.out.println(noe)
    }
}