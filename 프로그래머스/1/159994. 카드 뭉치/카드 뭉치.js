class Queue {
    items = [];
    front = 0;
    rear = 0;
    
    constructor(array) {
        this.items = array;
        this.rear = array.length;
    }
    
    push(item) {
        this.items.push(item);
        this.rear++;
    }
    
    pop() {
        return this.items[this.front++];
    }
    
    first() {
        return this.items[this.front];
    }
    
    isEmpty() {
        return front === rear;
    }
}

function solution(cards1, cards2, goal) {
    let queue1 = new Queue(cards1);
    let queue2 = new Queue(cards2);
    
    for(let i = 0; i < goal.length; i++) {
        if(queue1.first() === goal[i]) {
            queue1.pop();
        } else if (queue2.first() === goal[i]) {
            queue2.pop();
        } else {
            return 'No'
        }
    }
    
    return 'Yes';
}