package hackerRank.Algorithms.Warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
//		String result = "";
//		String a = s.substring(8);
//		String b = " " + a;
//		a = s.replace(a, b);
//		System.out.println(a);
//		
//		SimpleDateFormat fromFormat = new SimpleDateFormat("hh:mm:ss a");
//		SimpleDateFormat toFormat = new SimpleDateFormat("HH:mm:ss");
//		
//		try {
//			Date fromDate = fromFormat.parse(a);
//			System.out.println(fromDate);
//			String toDate = toFormat.format(fromDate);
//			result = toDate.toString();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		return result;
    }
}
