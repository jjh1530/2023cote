package a1;

import java.util.Scanner;

public class A1_12암호 {

	public String solution(int n, String str) {
		String answer ="";
		
		//4칸 배열
		for(int i =0; i<n; i++) {
			String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			str = str.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A1_12암호 T = new A1_12암호();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}

}
