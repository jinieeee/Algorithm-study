import java.util.*;

class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] result = new int[size];
        Map<Character, Integer> contains = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(contains.containsKey(a)) {
                result[i] = i - contains.get(a);
                
            } else {
                result[i] = -1;
            }
            contains.put(a, i);
        }
        
        return result;
    }
}