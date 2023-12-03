class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {board[0] / 2, board[1] / 2};
        
        for(int i = 0; i < keyinput.length; i++) {
            int x = answer[0];
            int y = answer[1];
            switch(keyinput[i]) {
                case "left": if(calc(x - 1, board[0])) {
                    answer[0] = x - 1;
                };
                    break;
                case "right": if(calc(answer[0] + 1, board[0])) {
                    answer[0] = x + 1;
                };
                    break;
                case "up" : if(calc(answer[1] + 1, board[1])) {
                    answer[1] = y + 1;
                };
                    break;
                case "down" : if(calc(answer[1] - 1, board[1])) {
                    answer[1] = y - 1;
                };
                    break;
            }
        }
        
        return new int[]{answer[0] - board[0] / 2, answer[1] - board[1] / 2};
    }
    
    private boolean calc(int endpoint, int position) {
        if(endpoint < position && endpoint >= 0) return true;
        return false;
    }
}