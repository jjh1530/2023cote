package a1;

import java.util.Scanner;

public class A1_7회문문자열 {

	public String solution(String str) {
		/*
		String answer = "NO";
		str =str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		if (str.equals(sb.reverse().toString())) {
			answer = "YES";
		}*/
		/*String answer ="YES";
		str =str.toLowerCase();
		int len = str.length();
		for(int i = 0; i<len/2; i++) {
			if (str.charAt(i)!=str.charAt(len-i-1)) {
				return "NO";
			}
		}*/
		String answer ="NO";
		int lt = 0;
		int rt = str.length()-1;
		char[] s = str.toCharArray();
		while(lt<rt ) {
			char tmp = s[lt];
			s[lt] = s[rt];
			s[rt] = tmp;
			lt++;
			rt--;
		}
		String tmp = String.valueOf(s);
		if(str.equals(tmp)) {
			answer ="YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A1_7회문문자열 T = new A1_7회문문자열();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
