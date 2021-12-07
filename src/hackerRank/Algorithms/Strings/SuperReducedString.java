package hackerRank.Algorithms.Strings;

import java.util.Arrays;
import java.util.Stack;

public class SuperReducedString {

	public static void main(String[] args) {
		System.out.println(superReducedString("aabbbccddd"));
		
	}
	
	public static String superReducedString(String s) {
		/* 예외가 너무 많이 발생
		 * char[] ch = s.toCharArray(); String result = ""; int count = 0;
		 * 
		 * for(int i = 0; i < ch.length; i++) { if(i == 0) { count += 1; } else {
		 * if(ch[i - 1] == ch[i]) { count += 1; } else { result += count % 2 == 0? "" :
		 * ch[i - 1]; count = 1; } } if(i == ch.length - 1) { result += count % 2 == 0?
		 * "" : ch[i - 1]; } System.out.println(result); }
		 * 
		 * return result.equals("")? "Empty String" : result;
		 */
		
		/* 다른 방법 */
		Stack<Character> stack = new Stack<>();
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(i == 0) {
				stack.push(ch[i]);
			} else {
				if(!stack.empty() && stack.peek() == ch[i]) {
					stack.pop();
				} else {
					stack.push(ch[i]);
				}
			}
		}
		String result = "";
		for(Character c : stack) {
			result += c;
		}
		return stack.empty()? "Empty String" : result;
	}
}


/* Discussion 참고
 * for (int i=1; i<s.length(); i++){
        if(s.charAt(i) == s.charAt(i-1)){
            s= s.substring(0 , i-1) + s.substring(i+1);
            i=0;
        }
    } 
    return s.length()==0? "Empty String" : s ;
    
    i번째 문자와 i-1번째 문자가 같으면 잘라내고 (i+1)번째 문자부터 끝까지를 더해 새로운 문자열 생성(같은 문자 2개를 지우기)
    & i값 초기화
 */