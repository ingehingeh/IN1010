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
          
        // Adding elements in the array
        for (int i = 0; i < mittArray.length; i++) {

            // Scan for value=2 and replace with 999
            if (mittArray[i] == 2) {
                mittArray[i] = 999;
                break;
            }
        }
          
        // Printing the elements
        for (int i = 0; i < mittArray.length; i++)  {
            System.out.print(mittArray[i] + " ");
        }
   }
}