import java.lang.RuntimeException;

public class IkkeGyldigNabo extends RuntimeException{

    public IkkeGyldigNabo(String typeBolig, String hvor){
        super(typeBolig + " kan ikke ha en nabo " + hvor);
    }
    
}
