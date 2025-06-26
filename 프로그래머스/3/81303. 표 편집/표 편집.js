class Grid {
    size = 0;
    rows = []; // [prev, next]
    now = 0;
    stack = [];
    
    create(n, k) {
        for(let i = 0; i < n; i++) {
            this.rows.push([i - 1, i + 1]);
        }
        this.size = n;
        this.now = k;
    }
    
    up(val) {
        while(val !== 0) {
            this.now = this.rows[this.now][0] < 0 ? this.now : this.rows[this.now][0];
            val--;
        }
    }
    
    down(val) {
        while(val !== 0) {
            this.now = this.rows[this.now][1] > this.size ? this.now : this.rows[this.now][1];
            val--;
        }
    }
    
    delete() {
        // index push
        this.stack.push(this.now);
        const prev = this.rows[this.now][0];
        const next = this.rows[this.now][1];
        
        // this.now 기준으로 삭제
        if(this.now > 0 && this.now < this.size && this.rows[this.now][1] < this.size) {
            this.rows[next][0] = prev;
        }
        
        if(this.now > 0 && this.now < this.size && this.rows[this.now][0] > -1) {
            this.rows[prev][1] = next;
        }
        
        // 현재 위치 변경
        this.now = this.rows[this.now][1] === this.size ? this.rows[this.now][0] : this.rows[this.now][1];
    }
    
    revoke() {
        // 최근 삭제된 행
        if(this.stack.length === 0) return;
        const index = this.stack.pop();
        
        // index 위, 아래 복구
        // 현재 위치 변경하지 않음
        const prev = this.rows[index][0];
        const next = this.rows[index][1];
        
        if(!!this.rows[prev]) this.rows[prev][1] = index;
        if(!!this.rows[next]) this.rows[next][0] = index;
    }
    
    getResult() {
        let answer = new Array(this.size).fill("O");
        while(this.stack.length !== 0) {
            answer[this.stack.pop()] = "X";
        }
        return answer.join("");
    }
}


function solution(n, k, cmd) {
    // 2차원 배열로 각 인덱스마다 up, down 위치 보유
    // cmd 명령어에 따라 선택된 인덱스의 up, down 값 변경 (switch ~ case)
    // 삭제하는 행은 인덱스를 stack에 저장
    let grid = new Grid();
    grid.create(n, k);
    
    // [[-1, 1], [0, 2], [1, 3], ...]
    for(let i = 0; i < cmd.length; i++) {
        // 명령어 분할
        let [c, value] = cmd[i].split(" ");
        switch (c) {
            case "U": {
                grid.up(value);
                break;
            }
            case "D": {
                grid.down(value);
                break;
            }
            case "C": {
                grid.delete();
                break;
            }
            case "Z": {
                grid.revoke();
                break;
            }
            default: return;
        }
    }
    
    return grid.getResult();
}