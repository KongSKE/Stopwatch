package stopwatch;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Measure time of append and sum task.
 * @author Varit Assavavisidchai
 * 
 */
public class Main {
        /** Using TaskTimer object to run and measure run time */
        static TaskTimer time = new TaskTimer();
	/**
	 * Append chars to a string.
	 */
	public static void testAppendToString(int count) {
            time.measureAndPrint(new AppendToString(count));
	}
	
	/**
	 * Append chars to a StringBuilder
	 */
	public static void testAppendToStringBuilder(int count ) {
            time.measureAndPrint(new AppendToStringBuilder(count));
	}
	
	/**
	 * Add double primitives from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDoublePrimitive(int counter) {
            time.measureAndPrint(new SumDoublePrimitive(counter));
	}
	
	
	/**
	 * Add Double objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDouble(int counter) {
            time.measureAndPrint(new SumDouble(counter));
	}
	
	
	/**
	 * Add BigDecimal objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumBigDecimal(int counter) {
            time.measureAndPrint(new SumBigDecimal(counter));
	}
	
	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) {

		SpeedTest.testAppendToString(50000);
		SpeedTest.testAppendToString(100000);
		SpeedTest.testAppendToStringBuilder(100000);
		
		int counter = 1000000000; 
		
		SpeedTest.testSumDoublePrimitive(counter);
		SpeedTest.testSumDouble(counter);
		SpeedTest.testSumBigDecimal(counter);
	}
}