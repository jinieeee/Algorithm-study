import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            progressQueue.add(progresses[i]);
            speedQueue.add(speeds[i]);
        };
        
        int day = 1;
        int index = 0;
        List<Integer> answer = new ArrayList<>();
        answer.add(0);
        
        while(!progressQueue.isEmpty()) {
            int progress = progressQueue.peek();
            int speed = speedQueue.peek();
            
            if(progress + speed * day >= 100) {
                progressQueue.poll();
                speedQueue.poll();
                answer.set(index, answer.get(index) + 1);
            } else {
                day++;
                if(answer.get(index) > 0) {
                    index++;
                    answer.add(0);
                }
            }
            
        }
        
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}