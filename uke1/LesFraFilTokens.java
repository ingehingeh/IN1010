// Les ett og ett ord fra fil
class LesFraFilTokens {
    public static void main(String[] args) {
        throws FileNotFoundException {
        File minFil = new File("Handleliste.txt");
        Scanner lesFil = new Scanner(minFil);
        while (lesFil.hasNext()) {
            String vare = lesFil.next();
            System.out.println(vare);
        }
        }
    }
}
