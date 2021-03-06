package stopwatch;

import java.math.BigDecimal;

/**
 *	This class is sum of BigDecimal.
 * @author Varit Assavavisidchai
 */
public class SumBigDecimal implements Runnable {
    /** Store times of append*/
    private int counter;
    /** Store char to append */
    private final char Character = 'a';
    /** Size of array*/
    static final int ARRAY_SIZE = 500000;
    /** Initialize array of BigDecimal */
    BigDecimal[] size = new BigDecimal[ARRAY_SIZE];
    /** Store sum results */
    BigDecimal sum = new BigDecimal(0.0);

    /**
     * Constructor for SumBigDecimalTask
     *
     * @param counter times of append
     */
    public SumBigDecimal(int counter) {
        this.counter = counter;
        for(int i=0; i<ARRAY_SIZE; i++) size[i] = new BigDecimal(i+1);
    }
    
    public void run() {
        for (int count = 0, i = 0; count < counter; count++, i++) {
            if (i >= size.length) {
                i = 0;
            }
            sum = sum.add(size[i]);
        }
    }

    /**
     * @return String of description and numbers of sum times.
     */
    public String toString() {
        return String.format("Sum array of BigDecimal objects with count=%,d",counter);
    }
}