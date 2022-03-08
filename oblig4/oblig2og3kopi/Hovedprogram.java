// IN1010 vår 22 oblig 2: Legemidler
// System som holder styr på leger, pasienter, resepter og legemidler.


class Hovedprogram {
    public static void main(String[] args) {

        // legemidler
        Narkotisk narkT = new Narkotisk("test", 100, 5.0, 10);
        Vanedannende vanedT = new Vanedannende("test", 100, 5.0, 10);
        Vanlig vanligT = new Vanlig("test", 100, 5.0);
        
        // leger
        Lege legeT = new Lege("Ola");
        Spesialist spesialT = new Spesialist("Fabian", "ABC123");

        //resepter
        Resept hResept = new HvitResept(narkT, legeT, 1, 1);
        Resept milResept = new Militaerresept(narkT, legeT, 1);
        Resept pResept = new Presept(narkT, legeT, 1, 1);
        Resept bResept = new BlaaResept(narkT, legeT, 1, 1);

        System.out.println(narkT + "\n" + vanedT + "\n" + vanligT);
        System.out.println(legeT +"\n" + spesialT);
        System.out.println(hResept + "\n" + milResept + "\n" + pResept + "\n" + bResept);
        
    }
}