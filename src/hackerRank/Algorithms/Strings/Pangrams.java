package hackerRank.Algorithms.Strings;

public class Pangrams {

	public static void main(String[] args) {
		System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
	}

	// 대소문자 구분 없도록 문자열을 전부 소문자로
	public static String pangrams(String s) {
		String regex = "abcdefghijklmnopqrstuvwxyz";
        char[] judge = new char[26];
        int result = 0;
        
        for(char ch : s.toLowerCase().toCharArray()) {
            if(regex.indexOf(ch) != -1) {
                judge[regex.indexOf(ch)] = 'Y';
            }
        }
        
        for(int i = 0; i < regex.length(); i++) {
            result += judge[i] == 'Y' ? 1 : 0;
        }
        
        return result == 26 ? "pangram" : "not pangram";
    }
}
