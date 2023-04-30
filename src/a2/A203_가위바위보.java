package a2;

import java.util.Scanner;

public class A203_가위바위보 {

	public String solution(int n,int[] arr1, int[] arr2) {
		String answer = "";
		//1 가위 2 바위 3 보
		for(int i = 0; i<n; i++) {
			if (arr1[i] == arr2[i]) {
				answer += "D";
			}else if(arr1[i] == 1 && arr2[i]== 2) {
				answer += "B";
			}else if(arr1[i] == 2 && arr2[i]== 3) {
				answer += "B";
			}else if(arr1[i] == 3 && arr2[i]== 1) {
				answer += "B";
			}else {
				answer +="A";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A203_가위바위보 T = new A203_가위바위보();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i =0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i =0; i<n; i++) {
			arr2[i] = sc.nextInt();
		}
		for(char x : T.solution(n, arr1, arr2).toCharArray()) {
		System.out.println(x);
		}
	}
}
