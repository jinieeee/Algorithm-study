package programmers.Practice;

import java.util.Arrays;

public class MathExam {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
	}

	// 모의고사
	// 학생들은 답을 찍을 예정, 정답률이 가장 높은 사람은?
	// 동점자가 여러명일 경우 오름차순으로 정렬하여 return
	
	public static int[] solution(int[] answers) {
		int[] first = {1,2,3,4,5};
		int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] result = new int[3];
		int[] count = new int[] {0, 0, 0};
		
		for(int i = 0; i < answers.length; i++) {
			if(i > 0 && i % 5 == 0)	count[0]++;
			if(i > 0 && i % 8 == 0)	count[1]++;
			if(i > 0 && i % 10 == 0) count[2]++;
			
			if(answers[i] == first[i - first.length * count[0]]) result[0]++;
			if(answers[i] == second[i - second.length * count[1]]) result[1]++;
			if(answers[i] == third[i - third.length * count[2]]) result[2]++;
		}
        
		// System.out.println(Arrays.toString(result));
		int max = result[0];
		String answer = "";
		
		for(int i = 0; i < result.length; i++) {
			if(max < result[i]) {
				max = result[i];
				answer = i + ",";
			} else if(max == result[i]) {
				answer += i + ",";
			}
		}
		// 최댓값 찾는 방법 참고
		// Math.max(result[0], Math.max(result[1], result[2])
		
		int[] resultArr = new int[answer.split(",").length];
		for(int i = 0; i < resultArr.length; i++) {
			resultArr[i] = Integer.parseInt(answer.split(",")[i]) + 1;
		}
		Arrays.sort(resultArr);
        return resultArr;
    }
}
