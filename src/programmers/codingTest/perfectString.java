package programmers.codingTest;

public class perfectString {

	public static void main(String[] args) {
		 System.out.println(solution("abc"));
	}
	/* a ~ z까지 모두 사용하는 문자열을 완벽한 문자열이라고 한다.
	 * 주어진 문장이 완벽한 문자열이 되기 위해서는 어떤 알파벳이 필요한가? */
	public static String solution(String sentence) {
        
        String regex = "abcdefghijklmnopqrstuvwxyz";
        
        for(char ch : sentence.toCharArray()) {
        	if(regex.indexOf(ch) != -1) {
        		regex.replace(ch + "", "");
        	}
        }
        System.out.println(regex);
        return regex;
    }

}
