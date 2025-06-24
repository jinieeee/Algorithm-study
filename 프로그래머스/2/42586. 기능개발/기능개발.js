function solution(progresses, speeds) {
    let answer = [];
    let count = 0;
    
    const days = progresses.map((value, index) => Math.ceil((100 - value) / speeds[index]));
    
    console.log(days);
    
    let maxDay = days[0];
    for(let i = 0; i < progresses.length; i++) {
        if(days[i] <= maxDay) {
            count++;
            continue;
        } else {
            maxDay = days[i];
            answer.push(count);
            count = 1;
        }
    }
    
    answer.push(count);
    
    return answer;
}