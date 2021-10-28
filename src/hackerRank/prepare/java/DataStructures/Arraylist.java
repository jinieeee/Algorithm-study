package hackerRank.prepare.java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		
		ArrayList arr = new ArrayList();
		
		for(int i = 0; i < a; i++) {
			int b = in.nextInt();
			int[] intList = new int[b];
			for(int j = 0; j < b; j++) {
				intList[j] = in.nextInt();
			}
			arr.add(intList);
		}
		
		int size = in.nextInt();
		for(int i = 0; i < size; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(arr.get(x-1));
		}
	}

}
