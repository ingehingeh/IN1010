public class Test {

    public static void main(String[] args) {
        
        Rom soverom = new Soverom(9,4,false);
        Rom stue = new Stue(30,5,true);

        System.out.println(soverom.typeRom());
        System.out.println(stue.typeRom());

        System.out.println(soverom.hentKvaliteter());
        System.out.println(stue.hentKvaliteter());

        System.out.println("\n\n-----KJØKKEN-----");
        Rom kjokken = new Kjokken(15, 2, true, false);

        System.out.println(kjokken.typeRom());
        System.out.println(kjokken.hentKvaliteter());
        System.out.println(kjokken.harVann());

        System.out.println("\n\n-----Bad-----");
        Rom bad = new Bad(15, 2, true, true, true);

        System.out.println(bad.typeRom());
        System.out.println(bad.hentKvaliteter());
        System.out.println(bad.harVann());

        System.out.println("\n\n\n\n");
        System.out.println(soverom.hentInfoOmRom());
        System.out.println(stue.hentInfoOmRom());
        System.out.println(kjokken.hentInfoOmRom());
        System.out.println(bad.hentInfoOmRom());

    }
}
