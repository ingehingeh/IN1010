
public class HarNokkel extends RuntimeException{

    public HarNokkel(String nokkel){
        super("Nokkel feil: " + nokkel + " forekommer allerede i lista");
    }
    
}
