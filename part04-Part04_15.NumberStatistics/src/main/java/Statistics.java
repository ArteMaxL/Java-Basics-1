
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.count != 0) {
            return 1.0 * sum() / getCount();
        }
        return 0;
    }
}
