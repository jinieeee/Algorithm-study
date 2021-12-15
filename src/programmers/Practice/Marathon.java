package programmers.Practice;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

	public static void main(String[] args) {
		String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] arr2 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(arr1, arr2));

	}
	
	public static String solution(String[] participant, String[] completion) {
		String result = "";
		// int[] arr = new int[participant.length];
		// Arrays.asList로 생성한 리스트는 원소 삭제가 불가능
		// List<String> list = Arrays.asList(completion);
		// List<String> list = new ArrayList<>(Arrays.asList(completion)); // 효율성 0점
		// Set<String> set = new HashSet<>(Arrays.asList(completion)); 중복값 허용하지 않으므로 불가능
		/*
		for(int i = 0; i < participant.length; i++) {
			if(list.contains(participant[i])) {
				list.remove(participant[i]);
				arr[i] += 1;
			}
		}
        
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				result = participant[i];
			}
		} */
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < participant.length; i++) {
			if(map.containsKey(participant[i])) {
				int total = map.get(participant[i]);
				map.put(participant[i], ++total);
			} else {
				map.put(participant[i], 1);
			}
		}
		
		// map에서 다시 remove 하도록 할 수도 있음
		for(int i = 0; i < completion.length; i++) {
			if(map.containsKey(completion[i])) {
				int total = map.get(completion[i]);
				map.put(completion[i], ++total);
			} else {
				map.put(completion[i], 1);
			}
		}
		
		for(String s : map.keySet()) {
			int total = map.get(s);
			if(total % 2 == 1) {
				result = s;
			}
		}
		
		return result;
    }
}
