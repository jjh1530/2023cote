package a2;

import java.util.ArrayList;
import java.util.Scanner;

public class A206_뒤집은소수 {
	
	public boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for(int i =2; i<num; i++) {
			if (num%i ==0) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>(); 
		
		String[] reverseArr = new String[n];
		/*
		for(int i =0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp >0) {
				int t = tmp %10;
				res = res*10 +t;
				tmp= tmp/10;
			}
			if (isPrime(res)) {
				answer.add(res);
			}
		}*/
	
		for(int i =0; i<n; i++) {
			StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
			reverseArr[i] = sb.reverse().toString();
			arr[i] = Integer.parseInt(reverseArr[i]);
			if (isPrime(arr[i])) {
				answer.add(arr[i]);
			}
		}
		
					
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		A206_뒤집은소수 T = new A206_뒤집은소수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print( x + " ");
			
		}
		
	}

}
