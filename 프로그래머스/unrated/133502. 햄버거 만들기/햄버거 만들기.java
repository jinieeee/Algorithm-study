import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
       
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        
        for(int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            
            if(stack.size() > 3) {
                if(stack.get(stack.size() - 4) == 1
                   && stack.get(stack.size() - 3) == 2
                   && stack.get(stack.size() - 2) == 3
                   && stack.get(stack.size() - 1) == 1
                ) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    result++;
                }
            }
        }

        
        return result;
    }
}