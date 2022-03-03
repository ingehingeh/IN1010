import java.util.Iterator;
import java.util.NoSuchElementException;


// uke 7 gruppetime

class Lenkeliste<T> implements Iterable<T> {
    Node start;

    private class Node {
        T data;
        Node neste;
        public Node(T d) {
            data = d;
        }
    }

    public boolean empty(){
        return start == null;
    }

    public void add(T data){
        Node n = new Node(data);
        if (empty()) {
            start = n;
        }
        else {
            Node tmp = start;
            while(tmp.neste != null){
                tmp = tmp.neste;
                }
            tmp.neste = n;
            }
        }

        public T pop() {
            if (empty()) {
                System.out.println("Empty list");
            }
            Node tmp = start;
            start = start.neste;
            return tmp.data;
        }

        public void print() {
            // bare en fancy for loop for demonstrasjon
            for (Node tmp = start; tmp != null; tmp=tmp.neste){
                System.out.println(tmp.data);
            }
        }

        public Iterator<T> iterator(){
            return new Xerator();
        }

        private class Xerator implements Iterator<T> {
            Node current = start;

            @Override
            public boolean hasNext(){
                return current != null;
            }

            @Override
            public T next() {
                if (current == null) throw new NoSuchElementException("next");
                Node tmp = current;
                current = current.neste;
                return tmp.data;
            }
        }

}