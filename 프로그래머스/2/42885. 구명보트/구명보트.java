import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i : people) {
            deque.add(i);
        }
        while(deque.size() > 0) {
            int last = deque.removeLast();
            if(deque.size() > 0 && last + deque.getFirst() <= limit) {
                deque.removeFirst();
            }
            boat += 1;
        }
        return boat;
    }
}