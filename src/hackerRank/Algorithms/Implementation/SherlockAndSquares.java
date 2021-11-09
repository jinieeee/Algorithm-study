package hackerRank.Algorithms.Implementation;

public class SherlockAndSquares {

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
