package a1;


import java.util.Scanner;

public class A1_9숫자만추출 {

	public int solution(String str) {
		int answer =0;
		for(char x : str.toCharArray()) {
			if (x>=48 && x<=57) {
				answer = answer*10+(x-48);
			}
		}
		/*
		String sNum = "";
		for(int i =0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sNum+=str.charAt(i);
			}
		}
		answer = Integer.parseInt(sNum);
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		A1_9숫자만추출 T = new A1_9숫자만추출();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
