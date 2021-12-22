package programmers.Practice;

public class DayOf2016 {

	public static void main(String[] args) {
		System.out.println(solution(1, 1));
		System.out.println(solution(1, 31));
		System.out.println(solution(2, 28));
		System.out.println(solution(3, 31));
		System.out.println(solution(4, 30));
		System.out.println(solution(5, 31));
		System.out.println(solution(12, 25));
	}

	// 2016년 1월 1일은 금요일이다. 2016년 a월 b일은 무슨 요일인가
	public static String solution(int a, int b) {
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int result = 0;
        switch(a) {
        case 1: result += b % 7; break;
        case 2: result += (31 + b) % 7; break;
        case 3: result += (31 + 29 + b) % 7; break;
        case 4: result += (31 + 29 + 31 + b) % 7; break;
        case 5: result += (31 + 29 + 31 + 30 + b) % 7; break;
        case 6: result += (31 + 29 + 31 * 2 + 30 + b) % 7; break;
        case 7: result += (31 + 29 + 31 * 2 + 30 * 2 + b) % 7; break;
        case 8: result += (31 + 29 + 31 * 3 + 30 * 2 + b) % 7; break;
        case 9: result += (31 + 29 + 31 * 4 + 30 * 2 + b) % 7; break;
        case 10: result += (31 + 29 + 31 * 4 + 30 * 3 + b) % 7; break;
        case 11: result += (31 + 29 + 31 * 5 + 30 * 3 + b) % 7; break;
        case 12: result += (31 + 29 + 31 * 5 + 30 * 4 + b) % 7; break;
        }
        
        // 매달 일수를 배열에 넣어 반복문으로 누적 계산할 수 있음
//        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        for(int i = 0; i < a - 1; i++) {
//        	result += months[i];
//        }
//        result %= 7;
        
        return day[result];
    }
}
