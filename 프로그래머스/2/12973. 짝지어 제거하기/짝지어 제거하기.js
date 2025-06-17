function solution(s) {
    let stack = [];
    
    stack.push(s[0]);
    for(let i = 1; i < s.length; i++) {
        const pre = stack.length > 0 ? stack.pop() : null;
        if(!pre) {
            stack.push(s[i]);
        } else if(pre !== s[i]) {
            stack.push(pre);
            stack.push(s[i]);
        }
    }
    
    return stack.length === 0 ? 1 : 0;
}