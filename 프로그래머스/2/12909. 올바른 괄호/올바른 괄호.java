import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        
        // 전체 길이가 홀수인 경우
        if(s.length() % 2 != 0) return false;

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            switch(current) {
                case '(': {
                    if(count >= 0) { count++; }
                    else { answer = false; }
                    break;
                }
                case ')': {
                    if(count > 0) { count--; } 
                    else { answer = false; }
                    break;
                }
            }
            
            if(!answer) break;
        }
        
        if(count > 0) answer = false;
        
        return answer;
    }
}