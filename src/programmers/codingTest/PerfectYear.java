package programmers.codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PerfectYear {

	public static void main(String[] args) {
		System.out.println(solution(9999));
		System.out.println(solution(1999));
	}

	/*
	 * 2016년은 아름다운 연도입니다. 아름다운 연도란, 연도를 구성하는 0부터 9까지의 숫자가 중복 없이 사용된 연도를 의미합니다. 즉,
	 * 2016년도는 2가 1번, 0이 1번, 1이 1번, 6이 1번씩 사용되었기 때문에 아름다운 연도라 부릅니다. 하지만 2344년도는 4가
	 * 2번씩 사용되었기 때문에 아름다운 연도라고 하지 않습니다. 아름다운 연도는 2015년도, 2016년도처럼 연속해서 존재하는 경우도 있지만,
	 * 특정 연도 이후로 굉장히 오랫동안 나오지 않을 때도 있습니다. 예를 들어, 1987년도 이후 처음 등장하는 아름다운 연도는
	 * 2013년도입니다. 특정 연도 P가 매개변수로 주어질 때, 해당 연도보다 큰 아름다운 연도 중 가장 작은 아름다운 연도를 return
	 * 하도록 solution 함수를 완성해주세요.
	 */
	
	public static int solution(int p) {
		p++;
        while(true) {
        	String origin = Integer.toString(p);
        	String[] nums = origin.split("");   
        	Set<String> numSet = new HashSet<>(Arrays.asList(nums));
        	// 9999년 다음의 아름다운 연도를 판별하기에 적합하지 않음
        	if(numSet.size() == origin.length()) {
        		break;
        	}
        	p++;
        }
        return p;
    }
}
