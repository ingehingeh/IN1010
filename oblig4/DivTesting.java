

// Div testing

class DivTesting {
    public static void main(String[] args) {

        String a = "Bente"; 
        String b = "Anders";  

        int compare = a.compareTo(b);  

        if (compare < 0) {  
            //a is smaller/before b in alphabet
        }
        else if (compare > 0) {
            //a is larger/after b in alphabet
        }
        else {  
            //a is equal to b
        } 

        System.out.println(compare);
        
    }
}
