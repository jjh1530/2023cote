package a2;

import java.util.Scanner;

public class A205_소수 {

	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i =2; i<=n; i++) {
			if (ch[i] == 0) {
				answer++;
				for(int j =i; j<=n; j= j+i) {
					ch[j] = 1;
				}
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		A205_소수 T = new A205_소수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
