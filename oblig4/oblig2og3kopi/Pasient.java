// IN1010 oblig 4 gruppearbeid
// Del C: Pasient

import java.util.ArrayList;

public class Pasient {
    String navn;
    String foedselsnr;
    int pasientID;

    // må selv velge type liste: Array/LinkedList/ArrayList/etc
    ArrayList <Resept> reseptListe = new ArrayList();

    public Pasient(String navn, String foedselsnr, int pasientID) {
        this.navn = navn;
        this.foedselsnr = foedselsnr;
        this.pasientID = pasientID;
    }



}