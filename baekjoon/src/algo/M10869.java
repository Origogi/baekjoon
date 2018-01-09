package algo;

import java.util.Scanner;

//10869. 사칙 연산
//https://www.acmicpc.net/problem/10869

public class M10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		scan.close();
	}

}
