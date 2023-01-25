import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String a = "RTCFJMAN";
        int[] points = new int[8];
        for(int i = 0; i < survey.length; i++) {
            int point = choices[i] - 4;
            int index = 0;
            if(point < 0) {
                index = a.indexOf(survey[i].charAt(0));
            } else {
                index = a.indexOf(survey[i].charAt(1));
            }
            points[index] += Math.abs(point);
        }
        
        for(int i = 0; i < points.length; i++) {
            char first = a.charAt(i);
            char second = a.charAt(i+1);
            if(points[i] == points[i + 1]) {
                answer += first > second ? second : first; 
            } else if(points[i] > points[i + 1]) {
                answer += a.charAt(i);
            } else {
                answer += a.charAt(i + 1);
            }
            i++;
        }

        return answer;
    }
}