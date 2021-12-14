package programmers.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lottos {

	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 0, 0};
		int[] b = {38, 19, 20, 40, 15, 25};
		System.out.println(Arrays.toString(solution(a, b)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++) {
        	set.add(win_nums[i]);
        }
        System.out.println(set);
        for(int i = 0; i < 6; i++) {
        	if(set.contains(lottos[i])) {
        		min += 1;
        	} else if(lottos[i] == 0) {
        		max += 1;
        	}
        }
        answer[0] = (max + min) < 2? 6: 7 - (max + min);
        answer[1] = min < 2? 6: 7 - min;
        // int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}
