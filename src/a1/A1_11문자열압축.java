package a1;

import java.util.Scanner;

public class A1_11문자열압축 {
	
	public String solution(String s) {
		String answer ="";
		s= s+" ";
		int cnt = 1;
		for(int i =0; i<s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			}else {
				answer += s.charAt(i);
				if (cnt > 1) {
					answer += cnt;
					cnt = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		A1_11문자열압축 T = new A1_11문자열압축();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
		
	}

}
