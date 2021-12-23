package programmers.Practice;

import java.util.HashSet;
import java.util.Set;

public class NoneNumber {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));

	}
	
	// 없는 숫자 더하기
	// 숫자  0 ~ 9 중에서 없는 숫자를 더한 값을 리턴
	// numbers의 모든 수는 다르다
	
	public static int solution(int[] numbers) {
//        int answer = 0;
//        Set<String> list = new HashSet<>();
//        
//        for(int i = 0; i < 10; i++) {
//        	list.add(Integer.toString(i));
//        }
//        
//        for(int i = 0; i < numbers.length; i++) {
//        	String a = Integer.toString(numbers[i]);
//        	if(list.contains(a)) {
//        		list.remove(a);
//        	}
//        }
//        
//        for(String s : list) {
//        	answer += Integer.parseInt(s);
//        }
//        
//        return answer;
		
		// 0 ~ 9까지 더하면 45, 여기에서 배열에 있는 값들을 빼면 답이 나온다.
		// 아니면 배열의 숫자를 다 더한 값을 빼기
		
		int answer = 45;
		for(int i : numbers) {
			answer -= i;
		}
		return answer;
    }
}
