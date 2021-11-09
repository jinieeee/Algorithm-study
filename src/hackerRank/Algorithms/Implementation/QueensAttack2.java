package hackerRank.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensAttack2 {

	public static void main(String[] args) {
		List<List<Integer>> a = new ArrayList<>();
		a.add(Arrays.asList(3, 5));
//		a.add(Arrays.asList(4, 2));
//		a.add(Arrays.asList(2, 3));
		System.out.println(queensAttack(8, 1, 4, 4, a));

	}
	
	// n*n 의 체스판에서 여왕이 공격할 수 있는 위치 count
	// r_q, c_q 여왕의 위치 row_num, col_num
	// k : obstacle의 수, obstacles : 여왕의 움직임을 막는 장애물들 위치
	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		int result = 0;
		result += ready(r_q - 1, c_q - 1, "--", n, obstacles);
		result += ready(r_q, c_q - 1, "0-", n, obstacles);
		result += ready(r_q + 1, c_q - 1, "+-", n, obstacles);
		result += ready(r_q + 1, c_q, "+0", n, obstacles);
		result += ready(r_q + 1, c_q + 1, "++", n, obstacles);
		result += ready(r_q, c_q + 1, "0+", n, obstacles);
		result += ready(r_q - 1, c_q + 1, "-+", n, obstacles);
		result += ready(r_q - 1, c_q, "-0", n, obstacles);
		return result;
    }
	
	private static int ready(int x, int y, String cal, int n, List<List<Integer>> obstacles) {
		int result = 0;
		switch(cal) {
		case "--" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x--, y--, obstacles) == true) {
					result += 1;
				} else {
					break;
				}
				// result += countAttack(n, x--, y--, obstacles) == true ? 1: 0;			
			};
			break;
		case "0-" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x, y--, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "+-" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x++, y--, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "+0" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x++, y, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "++" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x++, y++, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "0+" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x, y++, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "-+" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x--, y++, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		case "-0" : 
			while(true) {
				if(x < 1 || y < 1 || x > n || y > n) break;
				if(countAttack(n, x--, y, obstacles) == true) {
					result += 1;
				} else {
					break;
				}			
			};
			break;
		};
		
        return result;
	}

	private static boolean countAttack(int n, int i, int j, List<List<Integer>> obstacles) {
		List<Integer> list = new ArrayList<>();
		list.add(i);
		list.add(j);
		// System.out.println(list);
		if (obstacles.contains(list)) {
			return false;
		} else {
			return true;
		}
	}
}
