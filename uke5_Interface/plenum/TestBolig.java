public class TestBolig {
    public static void main(String[] args) {
        Rekkehus rekkehus = new Rekkehus(2020, "Blindernveien 5", false, 2, true, "A");
        Rekkehus rekkehus2 = new Rekkehus(2020, "Blindernveien 5", false, 2, true, "A");
        Leilighet leilighet = new Leilighet(2010, "Blindernveien 5", false, 3, 20, 500, 10);

        sammenlignBolig(rekkehus, leilighet);
        sammenlignBolig(rekkehus, rekkehus2);

        Rom soverom = new Soverom(9,4,false);
        Rom stue = new Stue(30,5,true);
        leilighet.leggTilRom(soverom);
        leilighet.leggTilRom(stue);

        if (leilighet.hentKvadratMeter() == 39) {
            System.out.println("Riktig!");
        } else {
            System.out.println("Feil :(");
        }

        rekkehus.registerNyNabo("venstre", false);
        System.out.println(rekkehus.hentAntallNaboer());
        System.out.println(rekkehus.harBraaketeNabo());
        leilighet.registerNyNabo("fjkbweifgbw", true); //Det er denne linja som kater feilmeldingen


    }

    public static void sammenlignBolig(Bolig bolig1, Bolig bolig2){
        if (bolig1.equals(bolig2)) {
            System.out.println("Like!");
        } else {
            System.out.println("Ulike :(");
        }
    }
}
