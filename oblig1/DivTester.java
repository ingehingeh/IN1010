// just testing

class DivTester {
    public static void main(String[] args) {

        int[] minIntArray = new int[6];

        minIntArray[0] = 199;
        minIntArray[1] = 5;

        for (int i :minIntArray) {
            System.out.println(i);
        }
        System.out.println("array length" + minIntArray.length); // length for array
        //System.out.println("array size" + minIntArray.size);   // size for ArrayList
        System.out.println("----------------------");

        Node[] rack99 = new Node[6];

        
        rack99[0] = new Node(512, 8);
        //rack99[3] = Node(256, 8);

        System.out.println("rack99 here: ");
        for (Node node : rack99) {
            System.out.println(node.antProsessor());
        }




    }
}