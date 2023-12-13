import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queues = new PriorityQueue<>();
        
        for(int i : scoville) {
            queues.add(i);
        }
        
        while(queues.peek() < K) {
            if(queues.size() < 2) return -1;
            int first = queues.poll();
            int second = queues.poll();
            
            int newFood = first + second * 2;
            queues.add(newFood);
            answer++;
        }
        
        return answer;
    }
}