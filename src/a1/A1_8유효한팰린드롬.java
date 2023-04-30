package a1;

import java.util.Scanner;

public class A1_8유효한팰린드롬 {

	public String solution(String str) {
		String answer ="NO";
		//알파벳아니면 공백
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp)) {
			answer ="YES";
		}
		/*
		str = str.toLowerCase();
		String nStr= "";
		for(char x : str.toCharArray()) {
			if (Character.isAlphabetic(x)) {
				nStr += x;
			}
		}
		
		StringBuilder sb = new StringBuilder(nStr);
		if (nStr.equals(sb.reverse().toString())) {
			answer = "YES";
		}
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		A1_8유효한팰린드롬 T = new A1_8유효한팰린드롬();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}
}
