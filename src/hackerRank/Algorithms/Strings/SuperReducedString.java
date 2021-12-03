package hackerRank.Algorithms.Strings;

public class SuperReducedString {

	public static void main(String[] args) {
		System.out.println(superReducedString("aabbbccddd"));
		
	}
	
	public static String superReducedString(String s) {
		
		char[] ch = s.toCharArray();
		String result = "";
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(i == 0) {
				count += 1;
			} else {
				if(ch[i - 1] == ch[i]) {
					count += 1;
				} else {
					result += count % 2 == 0? "" : ch[i - 1];
					count = 1;
				}
			}
			if(i == ch.length - 1) {
				result += count % 2 == 0? "" : ch[i - 1];
			}
			System.out.println(result);
		}
		
		return result.equals("")? "Empty String" : result;
	}
}
