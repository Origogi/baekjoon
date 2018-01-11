package algo;

import java.util.Scanner;

//1152. 단어의 개수
//https://www.acmicpc.net/problem/1152

public class M2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextInt() * scan.nextInt() * scan.nextInt() + "";
		int[] array = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			array[Integer.parseInt(str.charAt(i) + "")]++;
		}
		for (int i =0;i<10;i++) {
			System.out.println(array[i]);
		}
	}

}
