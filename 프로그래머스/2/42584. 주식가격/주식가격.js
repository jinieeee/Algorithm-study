function solution(prices) {
    let stack = [];
    let answer = new Array(prices.length).fill(0);
    
    for(let i in prices) {
        
        if(i === 0) {
            stack.push(i);
            continue;
        }
        
        while(stack.length > 0 && prices[i] < prices[stack[stack.length - 1]]) {
            let top = stack.pop();
            
            answer[top] = i - top;
        }
        
        stack.push(i);
    }
    
    while(stack.length > 0) {
        let top = stack.pop();
        answer[top] = prices.length - 1 - top;
    }
    
    return answer;
}