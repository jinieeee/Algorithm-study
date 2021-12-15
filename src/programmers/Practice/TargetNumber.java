package programmers.Practice;

public class TargetNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1};
		System.out.println(solution(arr, 3));

	}
	
	// DFS / BFS
	public static int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
    }
	
	public static int dfs(int[] numbers, int target, int i, int sum) {
		int result = 0;
		
		if(i == numbers.length) {
			if(sum == target) { 
				return 1;
			}
			return 0;
		}
		
		// 왜 i++ or ++i 라고 작성하면 안되는지?
		result += dfs(numbers, target, i + 1, sum - numbers[i]);
		result += dfs(numbers, target, i + 1, sum + numbers[i]);
		
		return result;
	}
}
