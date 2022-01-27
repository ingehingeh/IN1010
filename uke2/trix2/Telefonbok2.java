// Trix Uke 2: 02.08: Samlinger av objekter
// Du får utdelt Person klasse:

import java.util.ArrayList;
import java.util.HashMap;

class Telefonbok2 {
    public static void main(String[] args) {
        
        // a) oppretter 3 nye Person-objekter
        Person joakim = new Person("Joakim Hansen", 12345678, "Asksvingen");
        Person kristin = new Person("Kristin Hansen", 24681012, "Bjørksvingen");
        Person dag = new Person("Dag Hansen", 98765432, "Eiksvingen");
        Person dag2 = new Person("Dag Hansen", 98765432, "Eiksvingen2");

        /*
        // b) Legger Person-objekter inn i Array 
        // Person[] telefonbok = {joakim, kristin, dag};

        // LF sin versjon:
        Person[] telefonbok = new Person[10];
        telefonbok[0] = joakim;
        telefonbok[1] = kristin;
        telefonbok[2] = dag;

        // skriver ut info om hvert Person-objekt i Array
        for (int i=0; i < telefonbok.length; i++) {
            if (telefonbok[i] != null) {
                telefonbok[i].skrivInfo();
            }
        }
        

        // c) Legger Person-objekter inn i ArrayList
        ArrayList<Person> telefonbok = new ArrayList<>();
        telefonbok.add(joakim);
        telefonbok.add(kristin);
        telefonbok.add(dag);
       
        // skriver ut info om hvert Person-objekt i Array
        for (Person person : telefonbok) {
            person.skrivInfo();
        }
        */

        // d) 
        HashMap<String, Person> telefonbok = new HashMap<> ();
        telefonbok.put(joakim.hentNavn(), joakim);
        telefonbok.put(kristin.hentNavn(), kristin);
        telefonbok.put(dag.hentNavn(), dag);
        telefonbok.put(dag2.hentNavn(), dag2);

        for (Person person : telefonbok.values()) {
            person.skrivInfo();
        }
        
        



    
    

    }
}
