import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] citations) {

        Arrays.sort(citations);
        
        int answer = 0;
        for(int i = 0; i < citations.length; i++) {
            if(i < citations[citations.length - 1 - i]) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}