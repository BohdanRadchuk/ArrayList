public class NumberCounter {
    private int number;
    private int counter;

    public NumberCounter(int number, int counter) {
        this.number = number;
        this.counter = counter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return
                "{number=" + number +
                " counter=" + counter +
                "}\n";
    }
}
