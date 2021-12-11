package programmers.codingTest;

public class NthDigit {

	public static void main(String[] args) {
		System.out.println(solution(115));

	}
	
	public static int solution(int n) {
        if(n < 10) return n;
        // 1 ~ 9 : 9개
        // 10 ~ 99 : 9 * 10 * 2개
        // 100 ~ 999 : 9 * 10 * 10 * 3개 ...
        
        int num1 = 9;	// 갯수
        int num2 = 1;	// 자릿수
        int sum = 9;

        while(n >= (num1 * 10) * (num2 + 1)) {
            num1 *= 10;
            num2 += 1;
            sum += num1 * num2;
        }
        
        // 115 번째 구하는 경우 115 - 10 = 105
        n -= sum + 1;
        // 자리수의 총 숫자 갯수  + 몇 번째 숫자인지
        String str = String.valueOf((int)Math.pow(10, num2) + n / (num2 + 1));	// str : 62
        // 0 ~ 9 : 아스키코드 48 ~ 57
        // 그러므로 62의 1번째 2인 문자를 int로 바꾸면 50이므로 48('0')을 빼서 정확한 숫자를 알아낸다
        return str.charAt(n % ((int)num2 + 1)) - '0';
	}
}
