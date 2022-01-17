// class A for example program in Java
// Klassen A skal være i en egen fil som heter A.java
// Trenger ikke importeres om fil ligger i samme mappe

class A {
    // Deklarer først alle instansvariabler
    private String instansvar1;
    private int instansvar2;

    // Konstruktør. Kan initialisere instansvariabler
    // Merk: Må spesifisere type på argumentene
    // Trenger ikke 'self'
    public A(String arg1, int arg2) {
        instansvar1 = arg1;
        instansvar2 = arg2;
    }
    
    // Merk: må spesifisere type på argumentet
    // Merk: må spesifisere returtype
}