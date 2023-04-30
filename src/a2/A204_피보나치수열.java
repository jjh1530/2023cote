package a2;

import java.util.Scanner;

public class A204_피보나치수열 {
	public void solution(int n) {
		int a = 1;
		int b = 1;
		int c = 0; 
		System.out.print(a + " " + b + " ");
		for(int i= 2; i<n; i++) {
			c= a+b;
			System.out.print(c+" ");
			a= b;
			b=c;
		}

	/*
	public int[] solution(int n) {
		
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i =2; i<n; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		return answer;*/
	}
	
	public static void main(String[] args) {
		A204_피보나치수열 T = new A204_피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	/*
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}*/
		T.solution(n);
	}
}
