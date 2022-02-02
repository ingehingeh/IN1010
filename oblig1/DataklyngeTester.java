// IN1010 vår 22 oblig oppg 1: Dataklynge
// Dataklynge

class DataklyngeTester {
    public static void main(String[] args) {
        Node node1 = new Node(256, 4);
        Node node2 = new Node(512, 8);

        // nytt Rack med 6 node-plasser
        Rack rack1 = new Rack(6); 
        Rack rack2 = new Rack(6);

        rack1.settInn(node1);
        rack1.settInn(node2);
        rack1.settInn(node1);

        // rack1.skrivUtRack();
        
        //---------------------------
        Dataklynge dataklynge1 = new Dataklynge(6);

        dataklynge1.settInnNode(node1);
        dataklynge1.settInnNode(node1);
        dataklynge1.settInnNode(node1);
        dataklynge1.settInnNode(node1);
        dataklynge1.settInnNode(node1);
        dataklynge1.settInnNode(node1);
        // dataklynge1.settInnNode(node2);
        // dataklynge1.settInnNode(node2);
        // dataklynge1.settInnNode(node2);
        // dataklynge1.settInnNode(node2);

        dataklynge1.skrivUtDataklynge();

    }
}