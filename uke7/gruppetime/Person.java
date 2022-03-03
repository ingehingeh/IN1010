

class Person {

    String navn;
    int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public int compareTo(Person p ){
        return alder - p.alder;
    }

    
}