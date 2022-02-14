import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Dyresamling {

    List<Dyr> dyrene = new LinkedList<>();

    public Dyresamling(String filNavn) {
        lesFil(filNavn);
    }

    private void lesFil(String filNavn) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filNavn));
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] finner ikke filen " + filNavn);
            return;
        }

        while (sc.hasNextLine()) {
            String[] splittet = sc.nextLine().split(";");
            String dyr = splittet[0];
            String navn = splittet[1];
            Dyr dyret = null;

            if (dyr.equals("katt")) {
                boolean kortHaaret = Boolean.parseBoolean(splittet[2]);
                dyret = new Katt(navn, kortHaaret);
            } else if (dyr.equals("hund")) {
                boolean kortHaaret = Boolean.parseBoolean(splittet[2]);
                dyret = new Hund(navn, kortHaaret);
            } else if (dyr.equals("maake")) {
                int hastighet = Integer.parseInt(splittet[2]);
                dyret = new Maake(navn, hastighet);
            } else if (dyr.equals("orn")) {
                int hastighet = Integer.parseInt(splittet[2]);
                dyret = new Orn(navn, hastighet);
            } else {
                System.out.println("[ERROR] " + dyr + " ikke gyldig dyr");
            }

            if (dyret != null) {
                dyrene.add(dyret);
            }
        }
    }

    public void nyttAr() {
        for (Dyr dyr : dyrene) {
            dyr.haBursdag();
        }
    }

    public void printNavnOgAlder() {
        for (Dyr dyr : dyrene) {
            dyr.skrivInfo();
        }
    }

    public void spisMat(String navn) {
        for (Dyr dyr : dyrene) {
            if (navn.equals(dyr.hentNavn())) {
                dyr.spisMat();
                return;
            }
        }
        System.out.println("[ERROR]" + navn + " er ikke et dyr i systemet");
    }

    public void spisMus(String navn) {
        for (Dyr dyr : dyrene) {
            if (navn.equals(dyr.hentNavn()) && dyr instanceof Katt) {
                Katt katt = (Katt) dyr;
                katt.spisMus();
                return;
            }
        }
        System.out.println("[ERROR]" + navn + " er ikke en katt i systemet");
    }

    public void spisSoppel(String navn) {
        for (Dyr dyr : dyrene) {
            if (navn.equals(dyr.hentNavn()) && dyr instanceof Maake) {
                Maake maake = (Maake) dyr;
                maake.spistSoppel();
                return;
            }
        }
        System.out.println("[ERROR]" + navn + " er ikke en maake i systemet");
    }

    public void snakk() {
        for (Dyr dyr : dyrene) {
            String lyd = "";
            if (dyr instanceof Katt) {
                Katt katt = (Katt) dyr;
                lyd = katt.mjau();
            }
            if (dyr instanceof Hund) {
                Hund hund = (Hund) dyr;
                lyd = hund.bjeff();
            }
            if (dyr instanceof Maake) {
                Maake maake = (Maake) dyr;
                lyd = maake.skrik();
            }
            if (dyr instanceof Orn) {
                Orn orn = (Orn) dyr;
                lyd = orn.syngNasjonalSang();
            }
            System.out.println(dyr.hentNavn() + ": " + lyd);
        }
    }

    public void statistikk() {
        for (Dyr dyr : dyrene) {
            if (dyr instanceof Maake) {
                Maake maake = (Maake) dyr;
                System.out.println("Prosent soppel spist: " + maake.prosentSoppel() + "%");
            }
            if (dyr instanceof Katt) {
                Katt katt = (Katt) dyr;
                System.out.println("Prosent mus spist: " + katt.prosentMusSpist() + "%");
            }
        }
    }
}
