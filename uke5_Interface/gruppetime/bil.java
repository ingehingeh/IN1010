//Klassen Bil som implementerer TilSalgs og Fargelegg
class Bil implements TilSalgs, Fargelegg{

    int pris;
    int km;
    String farge;
  
    public Bil(int p, int k){
      pris = p;
      km = k;
    }
  
    public int kjoer(int k){
      km = k;
      return km;
    }
  
    @Override
    public void selg(){
      System.out.println("Denne bilen ble solgt til en pris: " + pris);
    }
  
    @Override
    public void endrePris(int p){
      pris = p;
    }
  
    @Override
    public int hentPris(){
      return pris;
    }
  
    @Override
    public void byttFarge(String f){
      farge = f;
    }
  
  }