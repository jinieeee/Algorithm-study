package programmers.Practice;

import java.util.Arrays;
import java.util.Stack;

public class DeleteNum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
	}
	// 연속된 숫자는 지우기
	// 배열의 값은 0 ~ 9 사이의 정수
	public static int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>();
		stack.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] != arr[i - 1]) {
        		stack.add(arr[i]);
        	}
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) {
        	answer[i] = stack.get(i);
        }
        
        return answer;
    }
}
