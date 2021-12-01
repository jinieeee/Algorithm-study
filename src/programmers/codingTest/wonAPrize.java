package programmers.codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}