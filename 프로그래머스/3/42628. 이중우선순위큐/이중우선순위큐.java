import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> orderQueue = new PriorityQueue<>();
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String o : operations) {
            Operation current = new Operation(o);
            if(current.isMax() && !reverseQueue.isEmpty()) {
                int max = reverseQueue.poll();
                orderQueue.remove(max);
            } else if(current.isMin() && !orderQueue.isEmpty()) {
                int min = orderQueue.poll();
                reverseQueue.remove(min);
            } else if(!current.isMax() && !current.isMin()){
                orderQueue.add(current.getNumber());
                reverseQueue.add(current.getNumber());
            }
        }
        
        if(orderQueue.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            
            answer[0] = reverseQueue.peek();
            answer[1] = orderQueue.peek();
        }
        
        return answer;
    }
}

class Operation {
    private String command;
    private int number;
    private Boolean max = false;
    private Boolean min = false;
    
    Operation(String operation) {
        this.command = operation.split(" ")[0];
        this.number = Integer.parseInt(operation.split(" ")[1]);
        if(command.equals("D")) {
            if(this.number > 0) {
                this.max = true;
            } else if(this.number < 0) {
                this.min = true;
            }
        }
    }
    
    public Boolean isMax() {
        return this.max;
    }
    
    public Boolean isMin() {
        return this.min;
    }
    
    public int getNumber() {
        return this.number;
    }
}