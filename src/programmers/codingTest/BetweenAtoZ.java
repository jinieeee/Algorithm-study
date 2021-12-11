package programmers.codingTest;

import java.util.ArrayList;
import java.util.List;

public class BetweenAtoZ {

	public static void main(String[] args) {
		
		System.out.println(solution("abcdazefz"));
	}

	public static int solution(String s) {
		int answer = 0;
        // a : 97 ~ z : 122
		// a-z 사이에 또 다른 a or z가 없는 경우의 수를 구하는 문제, 왜 방법을 빨리 생각하지 못했을까
		List<Integer> array = new ArrayList<>();
        if(s.contains("a") && s.contains("z")) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a') {
                	array.add(0);
                } else if(s.charAt(i) == 'z') {
                	array.add(1);
                }
            }
        } else {
            return 0;
        }
        
        for(int i = 0; i < array.size()-1; i++) {
        	if(array.get(i) == 0) {
        		answer += array.get(i + 1) == 1? 1: 0;
        	} else {
        		answer += array.get(i + 0) == 0? 1:0;
        	}
        }
        
        return answer;
	}
}
