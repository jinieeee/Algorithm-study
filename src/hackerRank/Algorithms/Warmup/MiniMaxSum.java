package hackerRank.Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		miniMaxSum(Arrays.asList(new Integer[]{256741038, 623958417, 467905213, 714532089, 938071625}));
	}
	
	// 숫자 5개가 들어있는 리스트 arr이 매개변수로 주어진다.
	// 이 중에서 4개의 숫자를 선택해 더했을 때 최소값이 되는 경우와 최대값이 되는 경우를 출력하라.
	// 결과는 long 타입이어야 한다.
	public static void miniMaxSum(List<Integer> arr) {
	    long total = 0;
	    int max = arr.get(0);
	    int min = arr.get(0);
	    for(int i : arr) {
	    	total += i;
	    	if(i > max) {
	    		max = i;
	    	} else if(i < min) {
	    		min = i;
	    	}
	    }
//	    System.out.println(total);
//	    System.out.println(max);
//	    System.out.println(min);
	    
	    System.out.println((total - max) + " " + (total - min));
    }
}
