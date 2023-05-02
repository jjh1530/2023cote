package a2;

import java.util.Scanner;

public class A207_점수계산 {

	public int solution(int n, int[] arr) {
		int answer = 0;
		int p = 0;
		for(int i =0; i<n; i++) {
			if (arr[i] ==0) {
				p = 0;
			}else {
				p++;
				answer+=p;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A207_점수계산 T = new A207_점수계산();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, arr));

	}

}
