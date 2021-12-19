package programmers.kakao;

public class NewId {

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm."));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("abcdefghijklmn.p")); // "abcdefghijklmn"
		System.out.println(solution("123_.def"));
		System.out.println(solution("=.="));
	}
	
	/* 아이디의 길이는 3자 이상 15자 이하여야 합니다.
	      아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
	      단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다. */
	
	public static String solution(String new_id) {
        // 정규표현식 풀이법 주석 처리 참고
		
        // 1. 소문자로 변경
        new_id = new_id.toLowerCase();
        // 2. 특수문자 제거
        // new_id = new_id.replaceAll("[^-_.a-z0-9]","");
        for(int i = 0; i < new_id.length(); i++) {
        	char ch = new_id.charAt(i);
        	if(!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_' || ch == '.')) {
        		new_id = new_id.substring(0, i) + new_id.substring(i + 1);
        		i--;
        	}
        }
        // 3. 중복 '.' 제거
        // new_id = new_id.replaceAll("[.]{2,}",".");
        for(int i = 0; i < new_id.length() - 1; i++) {
        	if(new_id.charAt(i) == new_id.charAt(i + 1) && new_id.charAt(i) == '.') {
        		new_id = new_id.substring(0, i) + new_id.substring(i + 1);
        		i--;
        	}
        }
        // 4. 앞, 뒤 '.' 제거
        // new_id = new_id.replaceAll("^[.]|[.]$","");
        if(new_id.charAt(0) == '.') {
        	new_id = new_id.substring(1);
        }
        // 5. 빈 문자열인지
        if(new_id.equals("")) {
        	new_id = "a";
        }
        // 6. 16자 이상인지
        if(new_id.length() > 15) {
        	new_id = new_id.substring(0, 15);
        }
        if(new_id.charAt(new_id.length() - 1) == '.') {
        	new_id = new_id.substring(0, new_id.length() - 1);
        }
        // 7. 길이가 2자 이하인지
        int index = new_id.length() - 1;
        while(new_id.length() < 3) {
        		new_id += new_id.charAt(index);
    	}
        
        return new_id;
    }
}
