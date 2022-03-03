class Test {

    public static void main(String[] args){

        Lenkeliste<String> l = new Lenkeliste<>();

        l.add("Daniel");
        l.add("Elise");
        l.add("Herman");
        l.add("Daniel2");
        l.add("Sindre");
        l.add("Thomas");
        l.add("Simon");
        l.add("Design");
        l.add("Rohit");
        l.add("Gorm");

        l.print();

        for (String s : l) {
            System.out.println(s);
        }
    }
}