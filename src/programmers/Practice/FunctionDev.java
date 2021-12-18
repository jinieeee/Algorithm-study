package programmers.Practice;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class FunctionDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 작업의 순서와 진행률이 적힌 progresses 배열과 각 작업별 개발속도가 적힌 speeds 배열
	// 각 배포마다 몇 개의 기능이 배포되는지 return
	public static int[] solution(int[] progresses, int[] speeds) {
		int size = progresses.length;
        int[] answer = new int[size];
        boolean end = true;
        
        Queue<Integer> q = null;
        for(int i = 0; i < size; i++) {
        	q.add(progresses[i]);
        }
        
        while(end) {
        	for(int i = 0; i < size; i++) {
        		int a = q.peek();
        		q.add(a + speeds[i]);
        	}
        }
        
        return answer;
    }
}
