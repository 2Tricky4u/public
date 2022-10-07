public class PeopleCounter {
    // EXERCISE: Design a "people counter" with TDD.
    // The counter:
    // - starts at 0
    // - has a configurable max
    // - can increment (+1)
    // - can reset (=0)

    private int counter;
    private final int max;

    public PeopleCounter(int max) {
        this.counter = 0;
        this.max = max;
    }

    public int getCounter() {
        return counter;
    }

    public int getMax() {
        return max;
    }
}
