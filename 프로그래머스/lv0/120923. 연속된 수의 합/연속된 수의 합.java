
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int min = 0;
        if(num % 2 == 0) {
            min = total / num - num / 2 + 1;
        } else {
            min = total / num - (num - 1) / 2;
        }
        
        for(int i = 0; i < num; i++) {
            answer[i] = min++;
        }    
        
        return answer;
    }
}