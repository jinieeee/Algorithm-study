package programmers.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlindRecruitment {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
		System.out.println(Arrays.toString(solution(4, new int[] {4, 4, 4, 4})));
	}

	// 실패율
	/* 전체 스테이지의 개수 N, 
	 * 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
	 * 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라. */
	
	public static int[] solution(int N, int[] stages) {
        // 스테이지에 도달한 플레이어 수
		int[] players = new int[N];
		int[] failure = new int[N];
		
		for(int i = 0; i < stages.length; i++) {
			int size = stages[i] > N? stages[i] - 1: stages[i];
			for(int j = 0; j < size; j++) {
				players[j]++;
				if(stages[i] <= N && j == size - 1) {
					failure[j]++;					
				}
			}
		}
		
		// System.out.println(Arrays.toString(players));
		// System.out.println(Arrays.toString(failure));
		
		Map<Integer, Double> percent = new HashMap<>();
		double[] fRate = new double[N];
		for(int i = 0; i < N; i++) {
			// 추후 정렬을 위해
			// Map과 배열에 값을 순서대로 같이 담기
			percent.put(i, players[i] != 0? (double)failure[i]/players[i]: 0);
			fRate[i] = players[i] != 0? (double)failure[i]/players[i]: 0;
		}
		
		double max = percent.get(0);
		int[] answer = new int[N];
		int[] test = new int[N];
		// 정렬(실패율로 내림차순 정렬, 실패율이 같으면 작은 stage 번호가 먼저)
		// 배열을 내림차순 정렬
		Arrays.sort(fRate);
		
		// Map에서 i번째 배열과 일치하는 값을 찾아 Key값 반환
		// 내림차순을 위해 역순으로 반복문 실행
		for(int i = N - 1; i >= 0; i--) {
			for(int j = 0 ; j < percent.size(); j++) {
               if(fRate[i] == percent.get(j)) {
                   answer[Math.abs(i - (N - 1))] = j + 1;
                   percent.replace(j,-1.0);
                   break;
               }
            }
		}

        return answer;
    }
}
