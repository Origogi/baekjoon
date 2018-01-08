package chapter10;

import java.util.Scanner;

/* 1978. 소수 찾기
 * https://www.acmicpc.net/problem/1978
 */

public class M1978 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int result = 0;

		for (int i = 0; i < size; i++) {

			if (true == isPrimeNum(scan.nextInt())) {
				result++;
			}
		}
		scan.close();

		System.out.print(result);
	}

	static boolean isPrimeNum(int arg) {

		if (arg == 1) {
			return false;
		}

		if (arg == 2) {
			return true;
		}

		for (int i = 2; i <= (arg / 2); i++) {
			if (arg % i == 0) {
				return false;
			}
		}
		return true;
	}
}
