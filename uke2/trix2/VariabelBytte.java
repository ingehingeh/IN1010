// Trix Uke 2: 02.14: Bytte verdier
// Oppgaven er hentet fra Big Java: Late objects (R5.14)

// Se på metoden under. Den skal bytte verdien i to variabler:

public static void main(String[] args) {
    int x = 3;
    int y = 4;
    variabelBytte(x, y);
    System.out.println(x + " " +y);
}

public static void variabelBytte(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
// Hvorfor fungerer ikke metoden slik den skal?
/*
Metoden bytter verdien i variablene, 
men siden den ikke returnerer noe, vil ikke verdiene av x og y oppdateres i main.
 x og y som eksisterer i metoden variabelBytte, 
 er kopier av verdiene til x og y som sendes fra main 
 - ikke de faktiske variablene.
*/
