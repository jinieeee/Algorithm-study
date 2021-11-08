package hackerRank.Algorithms.Implementation;

import java.util.List;

public class QueensAttack2 {

	public static void main(String[] args) {
		System.out.println();

	}
	
	// n * n의 체스판에서 여왕이 공격할 수 있는 위치 count
	// r_q, c_q 여왕의 위치 row_num, col_num
	// k : obstacle의 수, obstacles : 여왕의 움직임을 막는 장애물들 위치
	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
	    int result = 0;
	    
		return attackCount(result, n, k, r_q, c_q, obstacles);
    }

	public static int attackCount(int result, int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

	}
}
