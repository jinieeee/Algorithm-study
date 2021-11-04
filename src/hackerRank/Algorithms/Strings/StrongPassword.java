package hackerRank.Algorithms.Strings;

public class StrongPassword {
	
	public static void main(String[] args) {
		System.out.println(minimumNumber(7, "AUzs-nV"));
	}
	
	public static int minimumNumber(int n, String password) {
		int result = 0;
        
        String[] regexes = new String[] { "0-9",
                                          "a-z",
                                          "A-Z",
                                          "-!@#$%^&*()+" };
        for(String regex : regexes) {
            result += password.matches(".*[" + regex + "].*")? 0: 1;
            System.out.println(regex + ", " + result);
        }
        
        result = Math.max(6 - password.length(), result);
        
        return result;
    }
}
