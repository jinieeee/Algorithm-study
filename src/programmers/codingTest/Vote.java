package programmers.codingTest;

public class Vote {

	public static void main(String[] args) {
		
	}
	public static String solution(String vote) {
        char[] ch = vote.toCharArray();
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < ch.length; i++) {
        	if(ch[i] == 'A') {
        		a += 1;
        	} else if(ch[i] == 'B') {
        		b += 1;
        	} else {
        		c += 1;
        	}
        }
        String result = "C";
        if(c < ch.length/2) {
        	if(a > b) {
        		result = "A";
        	}
        	if(a < b) {
        		result = "B";
        	}
        	if(a == b) {
        		result = "AB";
        	}        	
        }
        return result;
    }
}
