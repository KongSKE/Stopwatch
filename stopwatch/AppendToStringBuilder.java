package stopwatch;

/**
 * This class is use to append a char.
 * @author Varit Assavavisidchai 
 */
public class AppendToStringBuilder implements Runnable{

    /** Store times of append */
    private int count;
    /** Store char to append */
    private final char Character = 'a';
    /** Initialize StringBuilder object */
    private StringBuilder build = new StringBuilder();

    /**
     * Initialize constructor for AppendToStringBuilder
     *
     * @param count times of append
     */
    public AppendToStringBuilder(int count) {
        this.count = count;
    }

    /**
     * Appends StringBuilder until reach count
     */
    public void run() {
        for (int k = 0; k < count; k++) {
            build = build.append(Character);
        }
    }

    /**
     * Get description of the task
     *
     * @return String of description and numbers of append times.
     */
    public String toString() {
        return "Append " + count + " chars to StringBuilder.";
    }
}