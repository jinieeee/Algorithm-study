package programmers.Practice;

public class StringToInt {

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
	}

	public static int solution(String s) {
        String result = "";
        String num = "";
        
//        for(int i = 0; i < s.length(); i++) {
//        	if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
//        		result += (int)s.charAt(i) - 48;
//        	} else {
//        		num += s.charAt(i);
//        		switch(num) {
//        		case "zero" : result += "0"; num = ""; break;
//        		case "one" : result += "1"; num = ""; break;
//        		case "two" : result += "2"; num = ""; break;
//        		case "three" : result += "3"; num = ""; break;
//        		case "four" : result += "4"; num = ""; break;
//        		case "five" : result += "5"; num = ""; break;
//        		case "six" : result += "6"; num = ""; break;
//        		case "seven" : result += "7"; num = ""; break;
//        		case "eight" : result += "8"; num = ""; break;
//        		case "nine" : result += "9"; num = ""; break;
//        		default: continue;
//        		}
//        	}
//        }
        
        // 문자열 배열을 만들어 replaceAll 하는 방법이 있음
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numbers.length; i++) {
        	s = s.replaceAll(numbers[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
