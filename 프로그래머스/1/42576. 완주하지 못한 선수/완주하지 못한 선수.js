function solution(participant, completion) {
    let participantMap = new Map();
    for(let i = 0; i < participant.length; i++) {
        let pre = participantMap.get(participant[i]);
        participantMap.set(participant[i], pre ? pre + 1 : 1);
    }
    
    for(let j = 0; j < completion.length; j++) {
        const result = participantMap.get(completion[j]);
        participantMap.set(completion[j], result - 1);
    }
    
    for (const [key, value] of participantMap) {
        if (value > 0) {
            return key;
        }
    }
}