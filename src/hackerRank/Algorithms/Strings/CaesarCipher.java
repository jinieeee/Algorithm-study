package hackerRank.Algorithms.Strings;

public class CaesarCipher {

	public static void main(String[] args) {
		System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
		System.out.println("!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E");
	}

	public static String caesarCipher(String s, int k) {
		// char[] ch = s.toCharArray();
	    String result = "";
	    k = k % 26;
	    for(int i = 0; i < s.length(); i++) {
	    	char c = s.charAt(i); // char 배열로 만드는 절차 없이 String의 charAt 메소드로 char 사용
	    	if((c >= 65 && c <= 90)) {
	    		result += !(c + k >= 65 && c + k <= 90) ? (char)(c + k - 26): (char)(c + k);
	    	} else if ((c >= 97 && c <= 122)) {
	    		result += !(c + k >= 97 && c + k <= 122) ? (char)(c + k - 26): (char)(c + k);
	    	} else {
	    		result += c;
	    	}
	    }
		return result;
	}
}
