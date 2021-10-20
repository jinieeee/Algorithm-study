package hackerRank.prepare.java.String;

import java.util.Scanner;

public class StringSolution {

	public static void main(String[] args) {
		// A와 B 단어 입력받아
		// 첫번째 결과는 두 단어의 글자수 합
		// 두번째 결과는 A가 B보다 사전적으로 앞에 위치하면 Yes, 그렇지 않으면 No
		// 세번째 결과는 각 단어의 첫글자를 대문자로 출력하고 A와 B를 한 칸 띄어 합쳐서 출력
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        
        for(int i = 0; i < charA.length; i++) {
        	if(charA[i] > charB[i]) {
        		System.out.println("Yes");
        		break;
        	} else {
        		System.out.println("No");
        		break;
        	}
        }
        
        String upperA = "";
        String upperB = "";
        for(int i = 0; i < charA.length; i++) {
        	if(i == 0) {
        		upperA += Character.toUpperCase(charA[i]);
        	} else {
        		upperA += charA[i];
        	}
        }
        
        for(int i = 0; i < charB.length; i++) {
        	if(i == 0) {
        		upperB += Character.toUpperCase(charB[i]);
        	} else {
        		upperB += charB[i];
        	}
        }
        System.out.println(upperA + " " + upperB);
	}
}
