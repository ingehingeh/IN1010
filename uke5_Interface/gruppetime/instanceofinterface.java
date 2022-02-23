import java.util.ArrayList;

//Dette programmet har en klasse Mobil, som ikke overskriver noe som helst.
//Det er ogsaa en klasse MobilTilSalgs, som utvider Mobil og implementerer TilSalgs.
class Main{
  public static void main(String[] args){

    //Vi lager en liste med noen Mobil objekter, og noen MobilTilSalgs objekter.
    ArrayList<Mobil> mobilListe = new ArrayList<>();
    mobilListe.add(new Mobil("2019",4));
    mobilListe.add(new MobilTilSalgs("2017",4,1000));
    mobilListe.add(new Mobil("2021",8));
    mobilListe.add(new MobilTilSalgs("2006",1,200));

    //For loekke som gaar gjennom alle elementene i mobilListe.
    for(int i = 0; i < mobilListe.size(); i++){
      Mobil mobil = mobilListe.get(i);

      //Ser om elementet har implementert TilSalgs
      if(mobil instanceof TilSalgs){
        System.out.println("Mobilen er til salgs!");
      }
      else{
        System.out.println("Mobilen er dessverre IKKE til salgs!");
      }
    }

  }
}

class Mobil{

  String aarsmodel;
  int minne;

  public Mobil(String a, int m){
    aarsmodel = a;
    minne = m;
  }
}

class MobilTilSalgs extends Mobil implements TilSalgs{

  int pris;

  public MobilTilSalgs(String a, int m, int p){
    super(a, m);
    pris = p;
  }

  @Override
  public void selg(){
    System.out.println("Mobil solgt for " + pris + "kr");
  }

  @Override
  public void endrePris(int p){
    pris = p;
  }

  @Override
  public int hentPris(){
    return pris;
  }

}