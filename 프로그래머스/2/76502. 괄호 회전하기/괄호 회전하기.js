function solution(s) {
    const n = s.length;
    let answer = 0;
    
    for(let i = 0; i < n; i++) {
        let isCorrect = true;
        let arr = [];
        
        for(let j = 0; j < n; j++) {
            const len = s[(i + j) % n];
            if(len === '(' || len === '[' || len === '{') {
                arr.push(len)
            } else {
                if(arr.length === 0) {
                    isCorrect = false;
                    break;
                }
                
                const top = arr.pop();
                
                if(!(top === '(' && len === ')' || 
                    top === '[' && len === ']' || 
                    top === '{' && len === '}')) {
                    isCorrect = false;
                    break;
                }
            }
        }
        
        if(isCorrect && arr.length === 0) {
            answer += 1;
        }
    }
    return answer;
}