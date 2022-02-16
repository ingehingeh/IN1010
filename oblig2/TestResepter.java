// IN1010 vår 22 oblig 2: Resepter
// Testprogram for Legemidler

import java.util.List;
import java.util.LinkedList;

public class TestResepter {

    public static void main(String[] args) {

        Narkotisk narkT = new Narkotisk("test", 100, 5.0, 10);
        Lege legeT = new Lege("Ola");

        Resept hResept = new HvitResept(narkT, legeT, 1, 1);
        Resept milResept = new Militaerresept(narkT, legeT, 1);
        Resept pResept = new Presept(narkT, legeT, 1, 1);
        Resept bResept = new BlaaResept(narkT, legeT, 1, 1);
        
        System.out.println("Enhetstesting av følgende:");
        System.out.println(hResept.toString());
        System.out.println(milResept.toString());
        System.out.println(pResept.toString());
        System.out.println(bResept.toString());
        
        // Legger i liste og itererer gjennom med for-loop
        List<Resept> resepter = new LinkedList<>();
        resepter.add(hResept);
        resepter.add(milResept);
        resepter.add(pResept);
        resepter.add(bResept);

        int teller = 1;
        for (Resept resept : resepter) {
            System.out.println("\nTester type: " + resept.hentKlasse());

            if (resept.hentId() == teller) {
                System.out.println("Id-test: ok");
            } else {
                System.out.println("Id-test: feil");
            } teller ++;
        
            if (resept.hentLegemiddel() == narkT) {
                System.out.println("Legemiddel-test: ok");
            } else {
                System.out.println("Legemiddel-test: feil");
            }
            if (resept.hentLege() == legeT) {
                System.out.println("Lege-test: ok");
            } else {
                System.out.println("Lege-test: feil");
            }
            if (resept.hentPasientId() == 1) {
                System.out.println("Pasient id-test: ok");
            } else {
                System.out.println("Pasient id-test: feil");
            }

            resept.bruk();
            if (resept instanceof Militaerresept) {                
                if (resept.hentReit() == 2) {
                    System.out.println("Reit-test: ok");
                } else {
                    System.out.println("Reit-test: feil");
                }
                
                if (resept.bruk() == true) {
                    System.out.println("Bruk-test: ok");
                } else {
                    System.out.println("Bruk-test: feil");
                }
            }
            else {
                if (resept.hentReit() == 0) {
                    System.out.println("Reit-test: ok");
                } else {
                    System.out.println("Reit-test: feil");
                }

                if (resept.bruk() == false) {
                    System.out.println("Bruk-test: ok");
                    } else {
                        System.out.println("Bruk-test: feil");
                    }
            }

            if (resept instanceof HvitResept) { 
                if (resept.farge() == "hvit") {
                    System.out.println("Farge-test: ok");
                } else {
                    System.out.println("Farge-test: feil");
                }
            }
            else if (resept instanceof BlaaResept) {
                if (resept.farge() == "blaa") {
                    System.out.println("Farge-test: ok");
                } else {
                    System.out.println("Farge-test: feil");
                }
            }

            if (resept instanceof Militaerresept) { 
                if (resept.prisAaBetale(100) == 0) {
                    System.out.println("Pris-test: ok");
                } else {
                    System.out.println("Pris-test: feil");
                }
            }
            else if (resept instanceof Presept) {
                if (resept.prisAaBetale(100) == 0) {
                    System.out.println("Pris-test: ok");
                } else {
                    System.out.println("Pris-test: feil");
                }
            }
            else if (resept instanceof BlaaResept) {
                if (resept.prisAaBetale(100) == 25) {
                    System.out.println("Pris-test: ok");
                } else {
                    System.out.println("Pris-test: feil");
                }
            }
        }

                



        
        /*
            resepter.settNyPris(102);
            if (resepter.hentPris() == 102) {
                System.out.println("NyPris-test: ok");
            } else {
                System.out.println("NyPris-test: feil");
            }

            if (resepter instanceof Narkotisk) {
                Narkotisk legemiddelNark = (Narkotisk) resepter;
                
                if (legemiddelNark.hentNarkotiskStyrke() == 10) {
                    System.out.println("Narkotisk styrke test: ok");
                } else {
                    System.out.println("Narkotisk styrke test: feil");
                }

            } else if (resepter instanceof Vanedannende) {
                Vanedannende legemiddelVaned = (Vanedannende) resepter;

                if (legemiddelVaned.hentVanedannendeStyrke() == 10) {
                    System.out.println("Vanedannende styrke test: ok");
                } else {
                    System.out.println("Vanedannende styrke test: feil");
                }
            }
            System.out.println("--------------------");
        }

        */
        
    }
    }