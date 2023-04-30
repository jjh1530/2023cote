package a2;

import java.util.Scanner;

public class A202_보이는학생 {

	public int solution(int n, int[] arr) {
		int answer =0;
		int max = Integer.MIN_VALUE;
		
		for(int i =0; i<n; i++) {
			if (arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A202_보이는학생 T = new A202_보이는학생();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
	}

}
