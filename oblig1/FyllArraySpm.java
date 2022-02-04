// Astro-Discourse spm

import java.util.Arrays;
  
public class FyllArraySpm {
      
    // Main function
    public static void main(String args[]) throws Exception 
    {
        // Array Declaration
        int mittArray[] = new int[10];
        mittArray[0] = 0;
        mittArray[1] = 1;
        mittArray[2] = 2;
        mittArray[3] = 2;
        mittArray[4] = 2;
        System.out.println(Arrays.toString(mittArray));
        
        // mittArray = [0,1,2,2,2,0,0,0,0,0] 
        
        //System.out.println(0 < mittArray.length);
        //System.out.println(mittArray[2] != 2);


/*
        //Lærer forslag:
        int i = 0;
        while (i < mittArray.length &&  mittArray[i] != 2) {
            
            System.out.println("Nå er i=" + i + " < " + mittArray.length + " OG " + 
            mittArray[i] + " er ulik 2");

            // Enten er i >= mittArray.length eller så er mittArray[i] == 2
            if (i < mittArray.length) {
                System.out.println("(If her) " + i + " < " + mittArray.length);
                System.out.println("Endrer nå " + mittArray[i] + " til 999");
                mittArray[i] = 999;
            }
        i++;
        }
         

            // Lærer forslag på løsning til Sett inn Node:
            int k = 0;
            while ( k < mittArray.length &&  mittArray[k] != 2) k++;
            // Enten er i >= mittArray.length eller så er mittArray[k] == 2
            if (k < mittArray.length) {
                    mittArray[k] = 999;
            }
            System.out.println(Arrays.toString(mittArray));
        }

        if(!alreadyExecuted) {
            doTrick();
            alreadyExecuted = true;
        }
        */
        
        boolean doneOnce = false;
        

            // Adding elements in the array
            for (int i = 0; i < mittArray.length; i++) {

                while (!doneOnce) {

                // Scan for value=2 and replace with 999
                if (mittArray[i] == 2) {
                    mittArray[i] = 999;
                    doneOnce = true;
                }
            }
        }
        System.out.println(Arrays.toString(mittArray));
        
          /*
        // Printing the elements
        for (int j = 0; j < mittArray.length; j++)  {
            System.out.print(mittArray[j] + " ");
        } */
   }
}

/*
Still can't figure out how to perform action once in loop 
== skip it, use break or try teacher solution


While loop
- sjekk lærebok etter semicolon triks/common loops
-- do while loop
-- while (!done), then set done to true

- google etter while-loop with semicolon
-- while loop, perform once

- skip, do oblig with break, simple!

*/