package a1;

import java.util.Scanner;

public class A1_5특정문자뒤집기 {

	public String solution(String str) {
		String result = "";
		char[] cArr = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		while (lt < rt) {
			// 알파벳이 아닐 때
			if (!Character.isAlphabetic(cArr[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(cArr[rt])) {
				rt--;
			} else {
				char tmp = cArr[lt];
				cArr[lt] = cArr[rt];
				cArr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		result = String.valueOf(cArr);

		return result;
	}

	public static void main(String[] args) {
		A1_5특정문자뒤집기 T = new A1_5특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}

}
