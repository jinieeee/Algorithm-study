package hackerRank.prepare.java.String;

import java.util.Scanner;

public class RegexSolution {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
	String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = num + "." + num + "." + num + "." + num;
}

// 자바 정규표현식

// 메타문자
// ^ : 텍스트 시작
// $ : 텍스트 끝
// [] : 범위
// . : 어떤 문자
// | : 또는
// [^ab] : a 또는 b강닌 문자. 대괄호 안에 ^ 작성하면 부정문
// \d : digit(숫자)
// \w : word(알파벳 + 숫자 + _)
// \s : space(공백문자 -탭, 띄어쓰기, 줄바꿈)

// 플래그 문자
// g: 전역 비교
// i : 대소문자 가리지 않고 비교
// m : 여러 줄의 검사 수행

// 수량 문자
// a+ : a가 한 개 이상
// a* : a가 0개 또는 여러개
// a? : a가 0개 또는 1개 (존재하거나 존재하지 않거나)
// a{5} : a가 5개
// a{2, 5} : a가 2~5개
// a{2,} : a가 2개 이상
// a{,2} : a가 2개 이하