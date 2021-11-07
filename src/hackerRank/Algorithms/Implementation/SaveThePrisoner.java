package hackerRank.Algorithms.Implementation;

public class SaveThePrisoner {

	public static void main(String[] args) {
		System.out.println(saveThePrisoner(3, 7, 3));
	}
	public static int saveThePrisoner(int n, int m, int s) {
		int result = 0;
		int mod = m % n;
		// 사탕을 받는 사람 번호 - 1, 1번이 시작인 경우 s는 인원의 마지막 번호
		// 그래야 남는 사탕을 s번 시작으로 카운트 할 수 있음
		s = (s - 1) == 0? s = n: s - 1;
		if(s + mod > n) {
			result = s + mod - n;
		} else {
			result = s + mod;
		}
		
		return result;
    }
}
