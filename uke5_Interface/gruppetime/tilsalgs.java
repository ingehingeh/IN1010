//Alle klasser som implementerer disse grensesnittene MAA implementere alle metodene.
//Hvordan metodene implementeres kan vaere forskjellig fra klasse til klasse.
interface TilSalgs{

    public void selg();
  
    public void endrePris(int p);
  
    public int hentPris();
  
  }
  
  
  interface Fargelegg{
  
    public void byttFarge(String f);
  
  }