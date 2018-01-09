package algo;

import java.util.Scanner;

//10871. X보다 작은 수
//https://www.acmicpc.net/problem/10871

public class M10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int compare = scan.nextInt();
		String result = "";
		for (int i = 0;i<n;i++ ) {
			int element = scan.nextInt();
			if (compare > element) {
				result += element + " ";
			}
		}
		scan.close();

		System.out.print(result.substring(0, result.length() -1));
	}

}
