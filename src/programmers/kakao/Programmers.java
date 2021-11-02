package programmers.kakao;

import java.util.Stack;

public class Programmers {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
        Stack<Integer> stack = new Stack<>();
        
        int x = 0;
        boolean input = false;
        
        for(int i = 0; i < moves.length; i++) {
            x = moves[i] - 1;
            for(int j = 0; j < board.length; j++) {
            	if(board[j][x] == 0) {
            		continue;
            	} else if(!stack.empty() && stack.peek() == board[j][x]) {
                    answer += 2;
                    stack.pop();
                } else {
                	stack.push(board[j][x]);
                }
                board[j][x] = 0;
                break;
            }
        }
        return answer;
	}

}
