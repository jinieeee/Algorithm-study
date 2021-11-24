package programmers.codingTest;

import java.util.Arrays;
import java.util.Collections;

public class sortNum {

	public static void main(String[] args) {
		System.out.println(solution(1236));
	}
	
	/* 제공되는 숫자를 내림차순, 오름차순으로 각각 정렬하면 나오는 숫자의 합을 구하시오
	 * ex) 1362 -> 1236 + 6321 = 7557 */
	public static int solution(int N) {
		String num = Integer.toString(N);
		String[] arr = new String[num.length()];
		String asc = "";
		String desc = "";
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i) + "";
		}
		
		Arrays.sort(arr);
		for(String s : arr) {
			asc += s;
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for(String s : arr) {
			desc += s;
		}

        return Integer.parseInt(asc) + Integer.parseInt(desc);
    }
}
