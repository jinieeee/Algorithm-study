package programmers.codingTest;

public class MoveCoordination {
	public static void main(String[] args) {
		System.out.println(solution("ULURRDLLU"));
	}
	
	/*
	 * 게임 캐릭터를 4가지 명령어를 통해 움직이려 합니다. 명령어는 다음과 같습니다.
	 * U: 위쪽으로 한 칸 가기
	 * D: 아래쪽으로 한 칸 가기
	 * R: 오른쪽으로 한 칸 가기
	 * L: 왼쪽으로 한 칸 가기
	 * 캐릭터는 좌표평면의 (0, 0) 위치에서 시작합니다. 좌표평면의 경계는 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 오른쪽 위(5,
	 * 5), 오른쪽 아래(5, -5)로 이루어져 있습니다. 이때, 우리는 게임 캐릭터가 지나간 길 중 캐릭터가 처음 걸어본 길의 길이를 구하려고
	 * 합니다. 단, 좌표평면의 경계를 넘어가는 명령어는 무시합니다.
	 */
	
	public static int solution(String dirs) {
		int answer = 0;
		
		boolean[][] coordLR = new boolean[11][10]; 
		boolean[][] coordUD = new boolean[10][11]; 
		int[] current = new int[] {5,5};

		char[] order = dirs.toCharArray();
		
		for(int i = 0; i < order.length; i++) {
			switch(order[i]) {
			case 'U' : {
				if(current[0] > 0) {
					current[0]--;
					// 기본 값 false이기 때문에 false면 answer에 +1 하고 값을 true로
					if(!coordUD[current[0]][current[1]]) answer++;
					coordUD[current[0]][current[1]] = true;
				}
				break;
			}
			case 'D' : {
				if(current[0] < 10) {
					if(!coordUD[current[0]][current[1]]) answer++;
					coordUD[current[0]][current[1]] = true;
					current[0]++;
				}
				break;
			}
			case 'L' : {
				if(current[1] > 0) {
					current[1]--;
					if(!coordLR[current[0]][current[1]]) answer++;
					coordLR[current[0]][current[1]] = true;
				}
				break;
			}
			case 'R' : {
				if(current[1] < 10) {
					if(!coordLR[current[0]][current[1]]) answer++;
					coordLR[current[0]][current[1]] = true;
					current[1]++;
				}
				break;
			}
			
			}
		}
		return answer;
    }
}
