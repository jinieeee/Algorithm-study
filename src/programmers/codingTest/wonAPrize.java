package programmers.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wonAPrize {
	/*
	 * 투썸플레이스 OO 지점에서는 사은 이벤트로 매일 고객 한 명을 임의로 선정해 커피 무료 쿠폰을 발송합니다. 
	 * 배열 arr에는 고객들의 ID가 이벤트에 당첨된 순서대로 들어있으며, 각 고객의 ID는 자연수입니다. 
	 * 쿠폰에 당첨된 고객 중, 가장 빨리 중복으로 당첨된 고객은 며칠 만에 중복 당첨됐는지를 return 하도록 solution 함수를 작성하세요.
	 * 단, 중복으로 당첨된 고객이 없는 경우 -1을 return 하세요. */
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 1, 4, 2, 1, 3};
		System.out.println(solution(arr));
	}
	
	// 이중 for문 비효율적
	/*
	public static int solution(int[] arr) {
        int answer = -1;
		List<Integer> list = new ArrayList<>();
        for(int i : arr) {
        	list.add(i);
        }
        Map<String, Integer> result = new HashMap<>();
        
        for(int i = 0; i < list.size() - 1; i++) {
        	for(int j = i + 1; j < list.size(); j++) {
        		if(list.get(i) == list.get(j)) {
        			if(result.containsKey(list.get(i).toString())) {
        				result.put(list.get(i).toString(), Math.min(result.get(list.get(i).toString()), j - i));        				
        			} else {
        				result.put(list.get(i).toString(), j - i);
        			}
        		}
        	}
        }
        
        if(result.size() > 1 && Collections.min(result.values()) > 0) {
        	answer = Collections.min(result.values());
        } else if (result.size() == 1) {
        	answer = result.values().iterator().next();        	
        }
        
        return answer;
    }
    */
	public static int solution(int[] arr) {
		int answer = -1;
		int min = 9999;
		
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		// arr2는 -1로 모두 초기화
		Arrays.fill(arr2, -1);
		
		// for문을 한 번만 사용
		/* arr1 에는 당첨자가 몇 번째에 (index)에 담고 
		 * arr2 에는 같은 당첨자가 다음으로 당첨되었을 때 몇 번만에 당첨되었는지를 담는다.
		 * 다음으로 당첨된 간격이 이전보다 작을 때만 arr2의 값을 변경한다 (최소 당첨 간격만 배열에 저장)
		 * 이 후 arr2의 최소값을 찾는다
		 * */
		for(int i = 1; i <= arr.length; i++) {
			int index = arr[i-1];
			if(arr1[index] > 0) {
				if(arr2[index] == -1) {
					arr2[index] = i - arr1[index];
					arr1[index] = i;
				} else if (i - arr1[index] < arr2[index]) {
					arr2[index] = i - arr1[index];
					arr1[index] = i;					
				}
			} else {
				arr1[index] = i;
			}
			System.out.println(i + "회전 arr1: " + Arrays.toString(arr1));
			System.out.println(i + "회전 arr2: " + Arrays.toString(arr2));
		}
		for(Integer i : arr2) {
			if(i != -1) {
				min = min > i? i: min;
			}
		}
		
		return (min == 100)? answer: min;
	}
}
