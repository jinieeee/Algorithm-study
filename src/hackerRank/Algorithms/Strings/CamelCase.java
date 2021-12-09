package hackerRank.Algorithms.Strings;

public class CamelCase {

	public static void main(String[] args) {
		System.out.println(camelcase("saveChangesInTheEditor"));
	}
	public static int camelcase(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            int index = (int)s.charAt(i);
            count += index >= 65 && index <= 90 ? 1 : 0;
        }
        return count + 1;
    }
}
