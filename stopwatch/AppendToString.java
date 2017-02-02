package stopwatch;

/**
 * Append chars to the string in specific times.
 * @author Varit Assavavisidchai
 */
public class AppendToString implements Runnable{
    /** Store times of append */
    private int count;
    /** Store char to append */
    private final char Character = 'a';
    /** Result of appended String */
    private String result = "";
    /**
     * Initialize constructor for AppendToString
     * @param count times of append
     */
    public AppendToString(int count){
        this.count = count;
    }
    /**
     * Appends String until reach count
     */
    public void run(){
        for(int k=0;k<count;k++){
            result = result + Character;
        }
    }
    /**
     * Get description of the task
     * @return String of description and numbers of append times.
     */
    public String toString(){
        return "Append "+count+" chars to String.";
    }
}
