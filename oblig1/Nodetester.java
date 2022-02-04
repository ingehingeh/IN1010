// Node tester

class NodeTester {
    public static void main(String[] args) {

        Node node1 = new Node(256, 4);
        Node node2 = new Node(512, 8);

        System.out.println(node1);
        System.out.println(node2.antProsessor());
        System.out.println(node2.nokMinne(124));
    }
}