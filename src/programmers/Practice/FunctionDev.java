package programmers.Practice;

import java.util.Queue;

public class FunctionDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 작업의 순서와 진행률이 적힌 progresses 배열과 각 작업별 개발속도가 적힌 speeds 배열
	// 각 배포마다 몇 개의 기능이 배포되는지 return
	// ex. 진행률 = {93, 30, 55}, 개발속도 = {1, 30, 5}
	// 7일뒤 2개(1,2번째), 9일뒤 2개(3번째)
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
        		int b = a + speeds[i];
        		q.add(b);
        	}
        }
        
        return answer;
    }
}
