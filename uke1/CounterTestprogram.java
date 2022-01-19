// Foreles 18.01.22: Teller

class CounterTestprogram {

    public static void main(String[] args) {
        Counter boardingCounter = new Counter();

        boardingCounter.count();
    
        int tall = boardingCounter.getValue();
        System.out.println("tall: " + tall);
    }
}
