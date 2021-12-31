package programmers.kakao;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BlindRecruitment {

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
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
				if(size != N && j == size - 1) {
					failure[j]++;
				}
			}
		}
		
		// System.out.println(Arrays.toString(players));
		// System.out.println(Arrays.toString(failure));
		
		Map<Integer, Double> percent = new HashMap<>();
		for(int i = 0; i < N; i++) {
			percent.put(i, players[i] != 0? (double)failure[i]/players[i]: 0);
		}
		
		double max = percent.get(0);
		int[] answer = new int[N];
		// System.out.println(percent.get(i));
		// 정렬(실패율로 내림차순 정렬, 실패율이 같으면 작은 stage 번호가 먼저)
		
		
        return null;
    }
}
