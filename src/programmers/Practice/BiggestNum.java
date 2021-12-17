package programmers.Practice;

import java.util.Arrays;

public class BiggestNum {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
	}
	

	public static String solution(int[] numbers) {
		String[] s = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			s[i] = Integer.toString(numbers[i]);
		}
		Arrays.sort(s);
		// 그냥 정렬하면 3, 30, 34와 같이 앞자리가 같은 경우 문제
		System.out.println(Arrays.toString(s));
	    String answer = "";
	    for(int i = numbers.length - 1; i >= 0; i--) {
	    	answer += s[i];
	    }
	    return answer;
	}
}
