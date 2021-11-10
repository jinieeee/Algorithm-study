package hackerRank.Algorithms.Warmup;

import java.util.GregorianCalendar;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("12:05:45AM"));
	}
	
	public static String timeConversion(String s) {
		String result = "";
		String oldHH = s.substring(0, 2);
//		PM 12시 = 12:00:00 / AM 12시 = 00:00:00 표시 불가능
		if(s.substring(8).equals("PM")) {
			if(oldHH.equals("12")) {
				result = s;				
			} else {
				String newHH = (Integer.parseInt(oldHH) + 12) + "";
				result = s.replace(oldHH, newHH);				
			}
		} else {
			if(s.substring(0, 2).equals("12")) {
				result = s.replace(oldHH, "00");
			} else {
				result = s;				
			}
		}
		
		return result.substring(0, 8);
    }
}
