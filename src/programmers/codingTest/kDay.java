package programmers.codingTest;

import java.util.Arrays;
import java.util.Date;

public class kDay {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(6, 25)));
	}
	
	/* 1월 1일의 요일이 day로 주어지고 매달 관리비 납부일이 k로 주어질 때 
	 * 매달 관리비 납부일이 평일이면 0, 주말이면 1이라고 표시하는 배열을 만들어 리턴 */
	public static int[] solution(int day, int k) {
		// 1/1 0 : 월요일 ~ 6 : 일요일
		int[] answer = new int[12];
		day--;
		for(int i = 1; i < 13; i++) {
			if(i == 1) {
				day = day + k % 7 > 6? day + k % 7 - 7: day + k % 7;
			} else if(i == 3) {
				// 3월
				day = day + 28 % 7 > 6 ? day + 28 % 7 - 7: day + 28 % 7;
			} else if((i % 2 == 0 && i < 7) || (i >= 7 && i % 2 == 1)) {
				// 홀수달
				day = day + 31 % 7 > 6 ? day + 31 % 7 - 7: day + 31 % 7;
			} else {
				// 짝수달
				day = day + 30 % 7 > 6 ? day + 30 % 7 - 7: day + 30 % 7;
			}
			System.out.println(day);
			if(day == 5 || day == 6) {
				answer[i-1] = 1;
			} else {
				answer[i-1] = 0;
			}
		}
        return answer;
    }
}
