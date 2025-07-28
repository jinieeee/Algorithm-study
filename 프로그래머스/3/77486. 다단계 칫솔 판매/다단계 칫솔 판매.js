function solution(enroll, referral, seller, amount) {
    let parent = {};
    let scores = {};
    
    for(let i = 0; i < enroll.length; i++) {
        // key: 판매원, value: 추천인
        parent[enroll[i]] = referral[i];
        // 점수 0
        scores[enroll[i]] = 0;
    }
    
    for(let j = 0; j < seller.length; j++) {
        let key = seller[j]; // 판매자
        let amt = amount[j] * 100; // 판매수량
        
        while(amt > 0 && key != '-') {
            let div = amt - Math.floor(amt / 10); // 분배금
            scores[key] = scores[key] + div;
            amt = Math.floor(amt / 10);
            key = parent[key]
        }
    }
    
    return Object.values(scores);
}

