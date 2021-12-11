package programmers.codingTest;

public class Regex {

	public static void main(String[] args) {
		System.out.println(solution("+82-10-3434-2323"));

	}

	public static int solution(String phone_number) {
	    int answer = 0;
	    String[] regex = {"[0-9]{3}.[0-9]{4}.[0-9]{4}",
	    				  "[0-9]{11}",
	                      "\\+[0-9]{2}.[0-9]{2}.[0-9]{4}.[0-9]{4}"};
	    for(int i = 0; i < 3; i++) {
	        if(phone_number.matches(regex[i])) {
	            return i + 1;
	        }
	    }
	    return -1;
	}
}
