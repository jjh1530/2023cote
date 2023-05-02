package a2;

import java.util.Scanner;

public class A210_봉우리 {

	public int solution(int n, int[][] arr) {
		int answer =0;
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		for(int i = 0; i<n; i++) {
			for( int j = 0; j<n; j++) {
				boolean flag = true;
				for(int k =0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					try {
						if (arr[nx][ny] > arr[i][j]) {
							flag = false;
							break;
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				if (flag) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		A210_봉우리 T =new A210_봉우리();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));

	}

}
