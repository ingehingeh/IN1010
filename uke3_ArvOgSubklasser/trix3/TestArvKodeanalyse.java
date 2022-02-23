// Trix uke 3: 03.07: Kodeanalyse (arv)

class TestArvKodeAnalyse {
    public static void main(String[] args) {
        // a)
        X x1 = (X) new Y();
        Y y1 = new Y();
        //Y y2 = new X(); //ugyldig, kan ikke definere Subklasse som new Superklasse
        Y y3 = new Z();
        Z z1 = new Z();
        Z z2 = (Z) new X(); //ugyldig

        /* b)
        Class hieracy
        S - G
        S - B - Q
        */
        S q = new G();
        Q b = new Q();
        B s = new Q();
        B g = new B();
        S p = new B();
        
    }
}


