class Lenkeliste {

    Node start;

    // Intern klasse (brukes bare inni i Lenkeliste)
    private class Node {

        private Node neste;
        private int data;
        Node(int data){
            this.data = data;
        }
    }

    public void add(int data) {
        if (start == null) {
            start = new Node(data);
        }
        Node tmp = start;
        while (tmp.neste != null) {
            tmp = tmp.neste;
        }
        tmp.neste = new Node(data);
    }

    public void skrivData() {
        Node tmp = start;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.neste;
        }
    }

    public int get(int i){ // get data at position/index nr. X
        int counter = 0;
        Node tmp = start;
        while (counter != i) {
            tmp = tmp.neste;
            counter ++;
        }
        return tmp.data;
    }

    public void remove(int data) {
        Node tmp = start;
        Node prev = null;
        
        while (tmp != null) {
            if (start.data == data) { // om fjerner start, forskyv start
                start = start.neste;
                return;
            }
            if (tmp.data == data){
                prev.neste = tmp.neste;
                return;
            }
            prev = tmp;
            tmp = tmp.neste;
        }
        System.out.println("Data not found");
        
    }


}