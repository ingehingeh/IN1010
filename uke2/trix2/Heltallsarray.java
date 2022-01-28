// Trix Uke 2: 02.10: Handletur

class Heltallsarray {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;

        int[] minArray = {a,b,c,d,e};

        int minArray2[] = new int[5];
        int arrayLengde = minArray2.length;

        // Legger tallene 0,1,2,3,4 inn i Array på plass 0-4
        int teller = 0;
        while (teller < arrayLengde) {
            minArray2[teller] = teller;
            teller ++;
        }

        teller = 0;
        System.out.println("Utskrift av array: ");
        while (teller < arrayLengde) {
            System.out.println("Array[" + teller + "] = " + minArray2[teller]);
            teller ++;
        }
    }
}