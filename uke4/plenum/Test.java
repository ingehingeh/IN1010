public class Test {
    public static void main(String[] args) {

        //Dyr gaupe = new Dyr("gaupe");
        Katt katt = new Katt("Pelle", true);

        katt.haBursdag();
        katt.spisMus();
        katt.spisMat();
        katt.skrivInfo();
        
        System.out.println(katt.prosentMusSpist());


        Dyr maake = new Maake("kra kra", 23);
        maake.skrivInfo();

        if(maake instanceof Maake){
            System.out.println("hei hei");
            Maake kraKra = (Maake) maake;
            kraKra.spistSoppel();
            kraKra.haBursdag();
        }

        maake.skrivInfo();
        

        Hund hund = new Hund("Max", true);
        System.out.println(hund.kortEllerLangPels());
        hund.haBursdag();
        hund.skrivInfo();

        Orn orn = new Orn("Jeff", 100);
        orn.flyTid(1000);

    }
}
