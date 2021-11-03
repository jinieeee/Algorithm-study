package hackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {


	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    int mResult = 0;
	    int nResult = 0;
	    
	    for(Integer apple : apples) {
	    	if(a + apple >= s && a + apple <= t) {
	    		mResult++;
	    	}
	    }
	    System.out.println(mResult);
	    for(Integer orange : oranges) {
//			삼항연사자 사용하는 것도 가능
	    	nResult += (b + orange >= s && b + orange <= t)? 1: 0;
	    }
	    System.out.println(nResult);
	}

	public static void main(String[] args) {
		countApplesAndOranges(7, 11, 5, 15, Arrays.asList(new Integer[] {-2, 2}), Arrays.asList(new Integer[] {5, -6}));
	}

}
