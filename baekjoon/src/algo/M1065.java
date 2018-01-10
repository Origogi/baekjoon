package algo;

import java.util.Scanner;

// 1065. 한수
//https://www.acmicpc.net/problem/1065

public class M1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		scan.close();
		int result = 0;
		for (int i = 1; i<= n;i++) {
			if (true == process(i)) {
				result++;
			//	System.out.println(i);
			}
		}
		System.out.print(result);
		
	}

	private static boolean process(int arg) {

		if (arg < 10) {
			return true;
		}
		int a = arg % 10;
		arg = arg/10;
		int b = arg % 10;
		int dist = b - a;
		while (arg > 0) {
			if (a + dist != b) {
				return false;
			}
			a = b;
			arg = arg / 10;
			if (arg == 0 ) {
				return true;
			}
			b = arg %10;

		}
		return true;

	}
}
