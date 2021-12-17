package programmers.Practice;

import java.util.Arrays;

public class KNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(array, commands));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int count = 0;
        int[] answer = new int[commands.length];
        while(count != commands.length) {
        	int i = commands[count][0] - 1;	// index : 1
        	int j = commands[count][1];	// index : 4
        	int k = commands[count][2] - 1;	// index : 2
        	int size = j - i;
        	int[] newArr = new int[size];
        	for(int num = 0; num < size; num++) {
        		// System.out.println(array[i]);
        		newArr[num] = array[i];
        		++i;
        	}
        	Arrays.sort(newArr);
        	// System.out.println(Arrays.toString(newArr));
        	// System.out.println(k);
        	
        	answer[count] = newArr[k];
        	count++;
        }
        return answer;
    }
}
