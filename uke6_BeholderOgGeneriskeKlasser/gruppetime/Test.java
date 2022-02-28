public class Test {
    public static void main(String[] args) {
        
        Lenkeliste l = new Lenkeliste();

        l.add(1);
        l.add(2);
        l.add(3);

        l.remove(2);

        l.skrivData();
        System.out.println("---------");

        System.out.println(l.get(2));
        System.out.println(l.get(999));

        
        
    }
}
