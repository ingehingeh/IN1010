public class TestDyresamling {

    public static void main(String[] args) {
        Dyresamling samling = new Dyresamling("dyr.txt");
        samling.printNavnOgAlder();
        samling.spisMus("pia");
        samling.spisMat("pia");
        samling.statistikk();
        samling.spisSoppel("kra kra");
        samling.statistikk();
        samling.nyttAr();
        samling.printNavnOgAlder();
        samling.snakk();
    }
    
}
