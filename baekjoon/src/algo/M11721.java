package algo;

import java.util.Scanner;

//11721. 열 개씩 끊어 출력하기 
//https://www.acmicpc.net/problem/11721

public class M11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		
		for(int i = 0;i<input.length();i++) {
			System.out.print(input.charAt(i));
			if (0!=i && 0== (i+1)%10) {
				System.out.println();
			}
		}
	}

}
