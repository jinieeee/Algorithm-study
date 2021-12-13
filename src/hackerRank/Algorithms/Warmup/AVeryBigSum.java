package hackerRank.Algorithms.Warmup;

import java.util.List;

public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static long aVeryBigSum(List<Long> ar) {
		long result= 0;
		for(Long a : ar) {
			result += a;
		}
		return result;
	}
}
