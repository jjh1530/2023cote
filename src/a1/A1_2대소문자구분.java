package a1;

import java.util.Scanner;

public class A1_2대소문자구분 {
	
	public String solution(String str) {
		String result ="";
		char[] cArr = str.toCharArray(); 
		for(int i =0; i<str.length(); i++) {
			if (Character.isLowerCase(cArr[i])) {
				result +=Character.toUpperCase(cArr[i]);
			}else {
				result +=Character.toLowerCase(cArr[i]);
			}
			/*
			if (cArr[i] >= 65 && cArr[i] <=96) {
				result+=Character.toLowerCase(cArr[i]);
			}else {
				result+=Character.toUpperCase(cArr[i]);
			}*/
		}
		return result;
	}

	public static void main(String[] args) {
		A1_2대소문자구분 T = new A1_2대소문자구분();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
