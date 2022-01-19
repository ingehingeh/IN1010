// Forelesning 18.01.22: Programmere en teller
// Grensesnitt: (metoder som tilbys utvendig/public)
// - count()
// - getValue()

class Counter {
    private int value;
    public Counter() {
        value = 0;
    }

    public void count() {
        value = value + 1;
        // value += 1;
        // value++
    }

    public int getValue() {
        return value;
    }
}
