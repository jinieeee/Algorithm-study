package programmers.codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{1, 2}, {2, 4}, {2, 2}}));
	}

	/*
	 * 회사에 급한 일이 생겨 많은 팀이 회의하게 되었습니다. 하지만 회의실은 1개밖에 없으므로 관리팀은 가능한 많은 팀이 회의할 수 있는 경우를
	 * 골라 그 팀들에게 회의실을 빌려주기로 하였습니다. 각 팀은 회의 시작 시각과 종료 시각을 적어 제출하였고, 편의상 한 팀이 회의를 종료하고
	 * 나가 다음 팀이 회의를 준비하는 시간은 0으로 가정합니다. 또한, 회의의 시작시간과 끝나는 시간이 같을 수도 있습니다. 각 팀이 제출한
	 * 회의 시작 시각과 종료 시각이 arr(배열)로 주어질 때, 회의를 할 수 있는 최대 팀의 개수를 반환하는 solution 함수를
	 * 완성하세요.
	 */

// 탐욕법(Greedy)
//	public static int solution(int[][] arr) {
//		
//		int answer = 0;
//		
//		// 정렬을 두번 하는 방법도 가능하다. 시작 시간을 기준으로 정렬한 후에 종료 시간을 기준으로 다시 정렬
//		Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// 종료시간이 같은 경우 시작 시간이 빠른 순으로 정렬
//				if(o1[1] == o2[1]) {
//					return o1[0] - o2[0];
//				}
//				// 그 외에는 종료시간으로 정렬
//				return o1[1] - o2[1];
//			}
//		});
//		
//		int endTime = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			// 시작 시간이 그 전타임 종료 시간과 같거나 작으면 회의 가능
//			if(endTime <= arr[i][0]) {
//				answer++;
//				endTime = arr[i][1];
//			}
//		}
//		
//		return answer;
//	}
	
	// 우선순위큐를 사용하는 방법은?
	public static int solution(int[][] arr) {
		
		
		return 0;
	}
}
