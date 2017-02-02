package stopwatch;

/**
 *	This class is use to add sum of double in a Double class array.
 * @author Varit Assavasidchai
 */
public class SumDouble implements Runnable {
    /** Collect times of append*/
    private int counter;
    /** Collect char to append */
    private final char CHAR = 'a';
    /** Maximum size of array */
    static final int ARRAY_SIZE = 500000;
    /** Initialize array of Double */
    Double[] size = new Double[ARRAY_SIZE];
    /** Store sum results */
    Double sum = new Double(0.0);

    /**
     * Initialize constructor for SumDoubleTask
     *
     * @param counter times of append
     */
    public SumDouble(int counter) {
        this.counter = counter;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            size[i] = new Double(i + 1);
        }
    }

    /**
     * Sum Double until reach count
     */
    public void run() {
        for (int count = 0, i = 0; count < counter; count++, i++) {
            if (i >= size.length) {
                i = 0;  // When get to last size. it will re-use.
            }
            sum = sum + size[i];
        }
    }

    /**
     * Get description of the task
     *
     * @return String of description and numbers of sum times.
     */
    public String toString() {
        return String.format("Sum array of Double objects with count=%,d",counter);
    }
}
