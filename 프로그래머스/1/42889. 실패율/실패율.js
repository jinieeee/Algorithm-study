function solution(N, stages) {
    // N: 전체 스테이지 개수, stages: 사용자가 멈춰있는 stage 배열
    // stage.length: 사용자수
    
    // N개 만큼의 배열
    let arr = new Array(N).fill(0);
    
    // stage별 멈춰있는 사용자 count
    for(let i = 0; i < stages.length; i++) {
        if(stages[i] !== N + 1) {
            arr[stages[i] - 1] += 1;
        }
    }
    
    let players = stages.length;
    
    // map => for 사용
    let failure = [];
    for(let i = 0; i < N; i++) {
        let rates = arr[i] / players;
        players -= arr[i];
        failure.push([i + 1, rates])
    }
    
    // 실패율 내림차순 정렬, 실패율이 같으면 작은 번호의 stage 먼저
    return failure.sort((a, b) => b[1] - a[1]).map(value => value[0]);
}