package a1;

import java.util.Scanner;

public class A1_6중복문자제거 {
	
	public String solution(String str) {
		String answer ="";
		for(int i =0; i<str.length(); i++) {
			//indexOf 맨 처음 나온 문자의 인덱스
			if (i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		A1_6중복문자제거 T = new A1_6중복문자제거();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		

	}

}
