package hackerRank.Algorithms.Strings;

public class CamelCase {

	public static void main(String[] args) {
		System.out.println(camelcase("saveChangesInTheEditor"));
	}
	public static int camelcase(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            int index = (int)s.charAt(i);
            count += index >= 65 && index <= 90 ? 1 : 0;
        }
        return count + 1;
    }
}

// 대문자인지 판별을 아스키 코드 외에 정규식으로 가능. 혹은 isUpperCase
// s.length() - s.replaceAll("[A-Z]", "").length() + 1
// String arr[]= s.split("[A-Z]")
// s.chars().filter(c -> Character.isUpperCase((char)c)).count()+1
