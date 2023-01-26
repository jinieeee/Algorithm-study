class Solution {
    public int solution(String s) {
        int answer = 1;
        
        while(s.length() > 1) {
            int totalLength = s.length();
            int[] count = new int[]{1, 0};
            char x = s.charAt(0);
            String xStr = s.charAt(0) + "";
            
            for(int i = 1; i < s.length(); i++) {
                if(x == s.charAt(i) || xStr.indexOf(s.charAt(i)) > 0) {
                    count[0]++;
                } else {
                    count[1]++;
                }
                
                if(count[0] == count[1]) {
                    s = s.substring(count[0] + count[1]);
                    break;
                }
            }
            
            // "aaba" "baaa" "aaaaaaaa"
            if(totalLength == s.length() && count[0] != count[1]) break;
            if(s.length() != 0) answer++;
        }
        
        return answer;
    }
}