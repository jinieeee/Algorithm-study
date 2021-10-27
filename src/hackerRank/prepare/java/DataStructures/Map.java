package hackerRank.prepare.java.DataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		HashMap<String, String> phoneBook = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phoneBook.put(name, Integer.toString(phone));
		}
		while(in.hasNext())
		{
			// test case 1 ~ 3 오류 발생
//			String s=in.nextLine();
//			String key = "";
//			Iterator<Entry<String, String>> itSet= phoneBook.entrySet().iterator();
//			boolean exist = false;
//			while(itSet.hasNext()) {
//				key = itSet.next().getKey();
//				if(s.equals(key)) {
//					exist = true;
//					break;
//				}
//			}
//			if(exist) {
//				System.out.println(s + "=" + phoneBook.get(key));				
//			} else {
//				System.out.println("Not Found");				
//			}
			
			String s = in.nextLine();
			if(phoneBook.containsKey(s)) {
				System.out.println(s + "=" + phoneBook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
	}

}
