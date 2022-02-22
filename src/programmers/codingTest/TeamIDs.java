package programmers.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamIDs {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"world", "prog"}, new String
				[]{"hello", "world", "code", "hello", "try", "code"})));
	}
	
	public static String[] solution(String[] teamIDs, String[] additional) {
        List<String> _answer = new ArrayList<>();
        // Queue<String> q = new LinkedList<String>(Arrays.asList(additional));
        List<String> _teamIDs = new ArrayList<>(Arrays.asList(teamIDs));
        
        for(int i = 0; i < additional.length; i++) {
        	if(!_teamIDs.contains(additional[i])) {
        		_answer.add(additional[i]);
        		_teamIDs.add(additional[i]);
        	}
        }
        
        return _answer.toArray(new String[0]);
    }
}
