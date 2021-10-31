package hackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = n;
		String print = null;
		
		while(n > 0) {
			for(int i = 0; i < a; i++ ) {
				print = i <= (n-2)? " ": "#";
				System.out.print(print);
			}
			System.out.println();
			n--;
		}

	}
}
