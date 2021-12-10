package hackerRank.Algorithms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		Integer[] queries = {1, 3, 12, 5, 9, 10};
		System.out.println(weightedUniformStrings("abccddde", Arrays.asList(queries)));
	}
	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
		// a : 97 ~ z : 122
		// time limit exceed : 너무 장황하게 풀었음.
		// 같은 문자의 갯수를 count하는 방식으로 변경해도 test case 4개 시간 초과
		// ArrayList는 탐색시간 O(log n), HashSet은 O(1)이므로 HashSet을 사용하는게 효율적
		Set<Integer> set = new HashSet<>();
		set.add(s.charAt(0) - 96);
		int count = 1;
		for(int i = 1; i < s.length(); i++) {
			int alt = (int) s.charAt(i) - 96;
			if(s.charAt(i - 1) != s.charAt(i)) {
				count = 1;
			} else {
				count++;
			}
			set.add(alt * count);
		}
		List<String> result = new ArrayList<>();
		for(int i = 0; i < queries.size(); i++) {
			if(set.contains(queries.get(i))) {
				result.add("Yes");
			} else {
				result.add("No");
			}
		}

		return result;
	}
}
