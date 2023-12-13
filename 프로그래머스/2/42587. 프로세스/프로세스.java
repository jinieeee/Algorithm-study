import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queues = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
            queues.add(priorities[i]);
        }
        
        while(!queues.isEmpty()) {
            for(int j = 0; j < priorities.length; j++) {
                if(queues.peek() == priorities[j]) {
                    queues.poll();
                    answer++;
                    
                    if(j == location) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}