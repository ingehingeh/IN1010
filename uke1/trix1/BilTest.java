// // 01.17: Bil-objekter

public class BilTest{
    public static void main(String[] args) {
        Bil bilGeir = new Bil("Geir Kjetil", "Ford");
        Bil bilSiri = new Bil("Siri", "Volvo");

        bilGeir.infoOmBil();
        bilSiri.infoOmBil();
    }
}
