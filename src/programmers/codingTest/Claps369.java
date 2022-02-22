package programmers.codingTest;

public class Claps369 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(33));
	}
	
	public static int solution(int num) {
        int answer = 0;

        // 숫자
        int _i = 1;
        // 몫
        int q = 0;
        while(_i <= num) {
            int i = _i;
            while(i >= 1) {
                int mod = i % 10;
                if(mod == 3 || mod == 6 || mod == 9) {
                    answer += 1;
                    break;
                } else {
                   i /= 10;  
                }
            }
            _i++;
        }
        return answer;
    }
}
