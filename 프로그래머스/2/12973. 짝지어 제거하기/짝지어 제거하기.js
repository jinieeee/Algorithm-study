function solution(s) {
    let stack = [];
    
    for(let i = 0; i < s.length; i++) {
        if(stack.length === 0) {
            // stack pop 불가하면 무조건 push
            stack.push(s[i]);
        } else if (stack[stack.length - 1] === s[i]) {
            // stack 마지막 값과 s[i] 값이 일치하면 제거 가능
            stack.pop();
        } else {
            // 제거 불가하면 stack push
            stack.push(s[i]);
        }
    }
    
    return stack.length === 0 ? 1 : 0;
}