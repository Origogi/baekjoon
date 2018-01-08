package chapter8;

import java.util.Scanner;

/* 1193. 분수찾기
 * 
 * https://www.acmicpc.net/problem/1193
 */

public class M1193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();
		
		int level = 0;
		int curPathCount = 0;
		while (curPathCount + level + 1 < n) {
			level++;
			curPathCount += level;
		}
		level++;

		int remainPathCount = n - curPathCount;
		boolean asc = level % 2 == 0 ? true : false;

		int a = 0;
		int b = 0;

		if (true == asc) {
			a = 1;
			b = level;
		}
		else {
			a = level;
			b = 1;
		}

		for (int i = 1; i < remainPathCount; i++) {
			if (true == asc) {
				a++;
				b--;
			} else {
				a--;
				b++;
			}
		}

		System.out.print(a + "/" + b);
	}

}
