package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1_4단어뒤집기 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		/*
		for(String x : str) {
			StringBuilder sb = new StringBuilder(x);
			answer.add(sb.reverse().toString());
			
		}*/
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp =  String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		A1_4단어뒤집기 T = new A1_4단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i =0; i<n; i++) {
			str[i] = sc.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		
	}
}
