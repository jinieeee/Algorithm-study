package hackerRank.Algorithms.Warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // a와 b 리스트를 받아서 각 index의 값 비교하기
		
        List<Integer> result = Arrays.asList(new Integer[] {0, 0});
        
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if(a.get(i) < b.get(i)) {
                result.set(1, result.get(1)+1);
            }
        }
        return result;
    }
}
