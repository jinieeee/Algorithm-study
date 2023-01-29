import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
        
        for(int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            switch(curr) {
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    left = curr;
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    right = curr;
                    break;
                default:
                    int leftLength = getLength(left, curr);
                    int rightLength = getLength(right, curr);

                    if(leftLength > rightLength) {
                        answer += "R";
                        right = curr;
                    } else if(leftLength < rightLength) {
                        answer += "L";
                        left = curr;
                    } else {
                        if(hand.equals("right")) {
                            answer += "R";
                            right = curr;
                        } else {
                            answer += "L";
                            left = curr;
                        }
                    }
                    break;
            }
        }
        
        return answer;
    }
    
    public static int getLength(int index, int number) {

		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;

		return Math.abs(x-numberX) + Math.abs(y-numberY);
	}
}