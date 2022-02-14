// IN1010 vår 22 oblig 2: Legemidler
// Testprogram for Legemidler

import java.util.List;
import java.util.LinkedList;

public class TestLegemidler {
    public static void main(String[] args) {

        Narkotisk narkT = new Narkotisk("test", 100, 5.0, 10);
        Vanedannende vanedT = new Vanedannende("test", 100, 5.0, 10);
        Vanlig vanligT = new Vanlig("test", 100, 5.0);

        System.out.println("Enhetstesting av følgende:");
        System.out.println(narkT.toString());
        System.out.println(vanedT.toString());
        System.out.println(vanligT.toString() + "\n");

        List<Legemidler> legemidler = new LinkedList<>();
        legemidler.add(narkT);
        legemidler.add(vanedT);
        legemidler.add(vanligT);

        int teller = 1;
        for (Legemidler legemiddel : legemidler) {
            System.out.println("Tester type: " + legemiddel.hentKlasse());
            //legemiddel.toString();

            if (legemiddel.hentId() == teller) { // antar er første opprettet objekt
                System.out.println("Id-test: ok");
            } else {
                System.out.println("Id-test: feil");
            } teller ++;
        
            if (legemiddel.hentNavn() == "test") {
                System.out.println("Navn-test: ok");
            } else {
                System.out.println("Navn-test: feil");
            }
        
            if (legemiddel.hentPris() == 100) {
                System.out.println("Pris-test: ok");
            } else {
                System.out.println("Pris-test: feil");
            }
        
            if (legemiddel.hentVirkestoff() == 5.0) {
                System.out.println("Virkestoff-test: ok");
            } else {
                System.out.println("Virkestoff-test: feil");
            }
        
            legemiddel.settNyPris(102);
            if (legemiddel.hentPris() == 102) {
                System.out.println("NyPris-test: ok");
            } else {
                System.out.println("NyPris-test: feil");
            }

            if (legemiddel instanceof Narkotisk) {
                Narkotisk legemiddelNark = (Narkotisk) legemiddel;
                
                if (legemiddelNark.hentNarkotiskStyrke() == 10) {
                    System.out.println("Narkotisk styrke test: ok");
                } else {
                    System.out.println("Narkotisk styrke test: feil");
                }

            } else if (legemiddel instanceof Vanedannende) {
                Vanedannende legemiddelVaned = (Vanedannende) legemiddel;

                if (legemiddelVaned.hentVanedannendeStyrke() == 10) {
                    System.out.println("Vanedannende styrke test: ok");
                } else {
                    System.out.println("Vanedannende styrke test: feil");
                }
            }
            System.out.println("--------------------");
        }
        
    }
}
