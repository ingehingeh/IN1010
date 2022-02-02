// Rack tester

class RackTester {
    public static void main(String[] args) {

        Node node1 = new Node(256, 4);
        Node node2 = new Node(512, 8);

        // nytt Rack med 6 node-plasser
        Rack rack1 = new Rack(6); 
        Rack rack2 = new Rack(6);

        rack1.settInn(node1);
        rack1.settInn(node2);
        rack1.settInn(node1);

        //System.out.println(rack1);
        //System.out.println(rack1.getAntNoder());
        //System.out.println(rack2.getAntNoder());

        rack1.skrivUtRack();
       // rack2.skrivUtRack();

        System.out.println(rack1.antProsessorer());
        System.out.println(rack1.noderMedNokMinne(2));
    }
}