package hackerRank.Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		System.out.println(birthdayCakeCandles(Arrays.asList(new Integer[] {4, 2, 1, 3})));

	}
	/* You are in charge of the cake for a child's birthday. 
	 * You have decided the cake will have one candle for each year of their total age. 
	 * They will only be able to blow out the tallest of the candles. Count how many candles are tallest. */
	
	public static int birthdayCakeCandles(List<Integer> candles) {
	    int tallest = 0;
	    int result = 0;
	    for(int i : candles) {
	    	if(tallest < i) {
	    		tallest = i;
	    		result = 1;
	    	} else if (tallest == i) {
	    		result += 1;
	    	}
	    }
	    return result;
    }
}
