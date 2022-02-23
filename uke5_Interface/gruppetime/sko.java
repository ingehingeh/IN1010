//Bare her for aa vise at flere klasser kan implementere samme interface. 
class Sko implements TilSalgs, Fargelegg{

    int pris;
    int stoerrelse;
  
    public Sko(int p, int s){
  
    }
  
    //Legg merke til at det ikke er noe krav til hva som kan skrives inn i metodene. Det velger vi helt selv.
    @Override
    public void selg(){
  
    }
  
    @Override
    public void endrePris(int p){
  
    }
  
    @Override
    public int hentPris(){
  
    }
  
  }