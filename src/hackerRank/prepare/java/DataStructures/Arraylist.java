package hackerRank.prepare.java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// ArrayList에 몇 개의 배열을 넣을 것인지 정하는 int
		int a = in.nextInt();
		in.nextLine();
		
		List arr = new ArrayList();
		
		// 반복문으로 입력받으면서 int[]에 숫자 입력 후 arrayList에 추가
		for(int i = 0; i < a; i++) {
			int b = in.nextInt();
			int[] intList = new int[b];
			for(int j = 0; j < b; j++) {
				intList[j] = in.nextInt();
			}
			arr.add(intList);
		}
		
		// 몇 번 입력받을지 정하는 int
		int i = in.nextInt();
		
		while(i > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			if(arr.size() > x-1 && ((int[])arr.get(x-1)).length > y-1) {
				System.out.println(((int[])arr.get(x-1))[y-1]);
			} else {
				System.out.println("ERROR!");
			}
			
//			indexOutOfBounds 오류가 발생할 수 있는 구문을 if 문으로 걸러냈지만 try-catch문으로 예외처리 할 수도 있음!!
//			try {
//				System.out.println(((int[])arr.get(x-1))[y-1]);
//			} catch(Exception e) {
//				System.out.println("ERROR!");
//			}
			
			i--;
		}
	}

}
