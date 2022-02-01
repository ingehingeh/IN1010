// Trix Uke 2: 02.19: Finn student ved navn

import java.util.HashMap;

class FinnStudent {
    public static void main(String[] args) {
        // HashMap med (Navn, tlf)
        HashMap<String,String> studenter = new HashMap<> ();
    }
        public boolean finnStudent(String navn){
            return studenter.containsKey(navn);
        }

        // Alternativt
        public boolean finnStudent(String navn){
            if(studenter.containsKey(navn)){
                 return true;
             } return false;
         }

    }