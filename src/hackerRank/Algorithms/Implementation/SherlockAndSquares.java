package hackerRank.Algorithms.Implementation;

public class SherlockAndSquares {
	
	// a와 b 사이의 제곱정수 개수
	public static void main(String[] args) {
		System.out.println(squares(3, 9));
	}
	
	public static int squares(int a, int b) {
		int result = 0;
		int i = 0;
		while(true) {
			if(i * i >= a && i * i <= b) {
				result++;
			} else if(i * i > b) {
				break;
			}
			i++;
		}
		return result;
    }
}
