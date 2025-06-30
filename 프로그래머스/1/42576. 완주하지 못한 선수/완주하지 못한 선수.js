function solution(participant, completion) {
    let obj = {};
    for(let i = 0; i < participant.length; i++) {
        if(obj[participant[i]]) {
            obj[participant[i]] += 1;
        } else {
            obj[participant[i]] = 1;
        }
    }
    
    for(let j = 0; j < completion.length; j++) {
        obj[completion[j]] -= 1;
    }
    
    for(const key in obj) {
        if(obj[key] > 0) {
            return key;
        }
    }
}