// gruppetime 03.02.22

class Klasserom {

    Student[] studenter = new Student[20];
    int antStudenter = 0;

    public void leggTilStudent(Student s){
        studenter[antStudenter] = s;
        antStudenter ++;
    }

    public void navneliste() {
        // Kan ikke bruke for-each løkke siden kan ha null-verdier
        // på tomme plasser
        for (int i = 0; i < antStudenter; i++) {
            studenter[i].siNoe(studenter[i].hentNavn());
        }
    }
}