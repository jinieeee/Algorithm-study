package hackerRank.Algorithms.Implementation;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
		String result = "";
//		방법 1. 실패
//		while(true) {
//			if(Math.abs(x1 - x2) > Math.max(v1, v2)) {
//				result = "NO";
//				break;
//			} else {
//				if(x1 == x2) {
//					result = "YES";
//					break;
//				} else {
//					x1 += v1;
//					x2 += v2;
//				}
//			}
//		}

//		방법2. 성공
//		- x1과 x2가 같은지 먼저 판별해야 함
//		while(true) {
//			if(x1 == x2) {
//				return "YES";
//			} else if(Math.abs(x1 - x2) <= Math.abs((x1 + v1) - (x2 + v2))) {
//				return "NO";
//			} else {
//				x1 += v1;
//				x2 += v2;
//			}
//		}
		
//		방법3. 수학 공식
		result = "NO";
		if(v2 < v1) {
			result = ((x1 - x2) % (v2 - v1) == 0)? "YES": "NO";			
		}
		return result;
		
//		result = "NO";
//		int num1 = x1 - x2; // x1 < x2
//		int num2 = v2 - v1; // 항상 음수여야 성립하기 때문에 v2 < v1
//		
//		if(v2 < v1) {
//			double test1 = num1 / num2;
//			int test2  = (int)test1;
//			
//			if(test1 == test2 && test1 > 0) {
//				result = "YES";
//			}			
//		}
//		return result;

	}

	public static void main(String[] args) {
		System.out.println(kangaroo(0, 8, 5, 2));
	}
}
