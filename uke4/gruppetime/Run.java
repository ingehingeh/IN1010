
// gruppetime 03.02.22

class Run {
    public static void main(String[] args) {
        Klasserom k = new Klasserom();
        k.leggTilStudent(new Student("Phillip", 31));
        k.leggTilStudent(new Student("Daniel", 24));
        k.leggTilStudent(new Student("Behrad", 21));
        
        k.navneliste();
        
    }
}

