package programmers.codingTest;

public class perfectString {

	public static void main(String[] args) {
		// System.out.println(solution("abc"));
		System.out.println(solution("We promptly judged antique ivory buckles for the next prize"));
	}
	/* a ~ z까지 모두 사용하는 문자열을 완벽한 문자열이라고 한다.
	 * 주어진 문장이 완벽한 문자열이 되기 위해서는 어떤 알파벳이 필요한가? */
	public static String solution(String sentence) {
        
        String regex = "abcdefghijklmnopqrstuvwxyz";
        String newArr = "";
		char[] result = new char[26];
		
		for(char ch : sentence.toLowerCase().toCharArray()) {
			if(regex.indexOf(ch) != -1) {
				result[regex.indexOf(ch)] = 'Y';
			}
		}
        
		for(int i = 0; i < regex.length(); i++) {
			if(result[i] != 'Y') {
				newArr += regex.charAt(i);
			}
		}
        
        return newArr;
    }
	// pangram 문제
	
}
