package hackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

	public static void main(String[] args) {
		sockMerchant(9, Arrays.asList(new Integer[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));

	}
	
	public static int sockMerchant(int n, List<Integer> ar) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		
		for(int a : ar) {
			if(map.containsKey(a)) {
				map.replace(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		
		Iterator<Integer> mapIt = map.keySet().iterator();
		while(mapIt.hasNext()) {
			int key = mapIt.next();
			result += map.get(key)/2;
		}
		System.out.println(result);
		return result;
    }
}
