function solution(board, moves) {
    let answer = 0;
    let stack = [];
    
    // board: N x N 격자
    let n = board.length;
    
    // x가 가로축, y가 세로축으로 가정.
    // moves: x값의 배열
    // 크레인 동작 시 x값 고정. y값이 작은 곳부터 인형이 있는지 탐색.
    // 인형(k) 뽑은 위치는 0으로 변경
    // 방금 뽑은 인형이 stack top 값과 같으면 상쇄하고 answer + 2
    
    for(let move of moves) {
        let k = 0;
        let x = move - 1;
        for(let i = 0; i < board.length; i++) {
            if(board[i][x] !== 0) {
                k = board[i][x];
                board[i][x] = 0;
                break;
            }
        }
        
        if(stack[stack.length - 1] === k) {
            answer += 2;
            stack.pop();
        } else if (k !== 0) {
            stack.push(k);
        }
    }
    
    return answer;
}