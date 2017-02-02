package stopwatch;

/**
 *
 * @author Varit Assavavisidchai
 */
public class SumDoublePrimitive implements Runnable {

    /** Store times of append*/
    private int counter;
    /** Store char to append */
    private final char CHAR = 'a';
    /** Maximum size of array */
    static final int ARRAY_SIZE = 500000;
    /** Initialize array of Double */
    double[] size = new double[ARRAY_SIZE];
    /** Store sum results */
    double sum = 0.0;

    /**
     * Initialize constructor for SumDoublePrimitive
     *
     * @param counter times of append
     */
    public SumDoublePrimitive(int counter) {
        this.counter = counter;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            size[i] = new Double(i + 1);
        }
    }

    public void run() {
        for (int count = 0, i = 0; count < counter; count++, i++) {
            if (i >= size.length) {
                i = 0;  // When get to last size. It will re-use the array.
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
        return String.format("Sum array of double primitives with count=%,d",counter);
    }
}