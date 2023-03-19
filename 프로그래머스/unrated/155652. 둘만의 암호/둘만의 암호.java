class Solution {
    public String solution(String s, String skip, int index) {
        char[] sCh = s.toCharArray();
        String answer = "";
        
        for(char ch : sCh) {
            int i = 0;
            while(i != index) {
                ch++;
                if(ch > 122) ch -= 26;
                if(skip.indexOf(ch) == -1) i++;
            }
            answer += ch;
            
        }
        
        
        return answer;
    }
}