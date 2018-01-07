package algorithm;

import java.util.*;

public class M1427 {

	/*
	 * 1427. 소트 인사이트
	 *  https://www.acmicpc.net/problem/1427
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		Character[] array = new Character[input.length()];

		for (int i = 0; i < input.length(); i++) {
			array[i] = input.charAt(i);
		}

		Arrays.sort(array, Collections.reverseOrder());

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
