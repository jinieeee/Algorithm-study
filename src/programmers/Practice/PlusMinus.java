package programmers.Practice;

public class PlusMinus {

	public static void main(String[] args) {

	}
	
	// 음양더하기
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i < absolutes.length; i++) {
			// 삼항연산자 사용한 풀이도 가능
			if(signs[i]) {
				answer += absolutes[i];
			} else {
				answer += absolutes[i] * -1;
			}
		}
        
        return answer;
    }
}
