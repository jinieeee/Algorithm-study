package programmers.codingTest;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicateString {

	public static void main(String[] args) {

	}
	/*
	 * 좋은 부분 문자열이란 어떤 문자열 s의 부분 문자열이면서 같은 알파벳이 두 번 이상 나타나지 않는 문자열을 말합니다. 예를 들어 주어진
	 * 문자열이 "abac" 일 때, 부분 문자열 "a", "ab", "bac"등은 원래 문자열 "abac" 의 부분 문자열이면서 문자열 내에
	 * 같은 알파벳이 두 번 이상 나타나지 않으므로 좋은 부분 문자열입니다. 그러나 "aba", "abac"는 문자열 내에 같은 알파벳 'a'가
	 * 두 번 이상 나타나므로 좋은 부분 문자열이 아닙니다. 문자열 s가 주어질 때 좋은 부분 문자열의 개수를 return 하도록 solution
	 * 함수를 완성해주세요.
	 */
	public static int solution(String s) {
		Set<String> resultSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            String part = "";
            for(int j = i; j < s.length(); j++) {
                String ch = s.substring(j, j + 1);
                if(part.contains(ch)) {
                    break;
                } else {                    
                    part += ch;
                }

                resultSet.add(part);
            }
        }
        return resultSet.size();
    }
}
