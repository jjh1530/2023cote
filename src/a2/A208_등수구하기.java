package a2;

import java.util.Arrays;
import java.util.Scanner;

public class A208_등수구하기 {
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i =0; i<n; i++) {
			int cnt = 1;
			for(int j =0; j<n; j++) {
				if (arr[i]< arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}

		
		return answer;
	}

	public static void main(String[] args) {
		A208_등수구하기 T = new A208_등수구하기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x+ " ");
		}

	}

}
