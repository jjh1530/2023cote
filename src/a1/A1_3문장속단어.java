package a1;

import java.util.Scanner;

public class A1_3문장속단어 {
	
	public String solution(String str) {
		String result = "";
		int m = Integer.MIN_VALUE;
		int pos ;
		while((pos=str.indexOf(" "))!= -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				result = tmp;
			}
			str = str.substring(pos+1);
		}
		if (str.length()>m) {
			result = str;
		}
		/*
		
		String[] arr = str.split(" ");
		for(int i =0; i< arr.length; i++) {
			int len =arr[i].length();
			if (len > m) {
				m = len;
				result = arr[i];
			}
			
		}*/
		return result;
	}

	public static void main(String[] args) {
		A1_3문장속단어 T = new A1_3문장속단어();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
	}

}
