package hackerRank.Algorithms.search;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(new Integer[] {2, 0, 0, 0});
		System.out.println(balancedSums(arr));
	}

	// time limit 2건 발생
	public static String balancedSums(List<Integer> arr) {
	    String result = "NO";
//		for(int i = 0; i < arr.size(); i++) {
//			int sum = 0;
//			if(i == 0 || i == arr.size() - 1) {
//				for(int j = 0; j < arr.size(); j++) {
//					sum += arr.get(j);
//				}
//				if(sum - arr.get(i) == 0) {
//					result = "YES";
//					break;
//				}
//			} else {
//				int left = 0;
//				int right = 0;
//				for(int j = 0; j < i; j++) {
//					left += arr.get(j);
//				}
//				for(int k = i + 1; k < arr.size(); k++) {
//					right += arr.get(k);
//				}
//				if(left == right) {
//					result = "YES"; 
//					break;
//				}
//			}
//		}
	    
	    // minus 활용하기. 전체 합에서 i까지의 합을 빼는 것.
	    int total = 0;
	    int left = 0;
	    
	    // 전체 합 계산
	    for(int a : arr) {
	    	total += a;
	    }
	    
	    for(int b : arr) {
	    	left += b;
	    	if(total - left == left - b) {
	    		result = "YES";
	    		break;
	    	}
	    }
	    
		return result;
    }
}
