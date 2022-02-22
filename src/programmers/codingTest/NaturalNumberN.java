package programmers.codingTest;

public class NaturalNumberN {

	public static void main(String[] args) {
		// System.out.println(solution(10));
		System.out.println("결과 : " + solution(33333));
	}
	public static int solution(int n) {
		// 자연수 n
		// q : n의 각 자리수 합
		int q = 0;

        // n이 10 이상인 경우에 실행
		while(true) {
			while (n >= 1) {
				// q에 누적해서 각 자리수 더하기
				q += n % 10;
				
				// q에 더했으니 n의 한자리 숫자 빼기
				n /= 10;
			}
			if(q > 10) {
				n = q;
				q = 0;
			} else {
				break;
			}
		}
        return q;
    }
}
