package hackerRank.prepare.java.Introduction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}

}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	// Calendar calendar = new GregorianCalendar(year, month - 1, day);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String result = "";
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch(dayOfWeek) {
        case 1 : result = "SUNDAY"; break;
        case 2 : result = "MONDAY"; break;
        case 3 : result = "TUESDAY"; break;
        case 4 : result = "WEDNESDAY"; break;
        case 5 : result = "THURSDAY"; break;
        case 6 : result = "FRIDAY"; break;
        case 7 : result = "SATURDAY"; break;
        }
        return result;
    }

}