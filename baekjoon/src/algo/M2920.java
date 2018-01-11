package algo;

import java.util.Scanner;

//2920.  음계
//https://www.acmicpc.net/problem/2920

public class M2920 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean bInc = false;
		int cur = scan.nextInt();
		if (cur == 1) {
			bInc = true;
		}
		else if (cur !=8) {
			System.out.println("mixed");
			return;
		}
		
		for (int i = 1;i<8;i++) {
			int next = scan.nextInt();
			if (bInc == true && cur + 1 == next) {
				cur = next;
			}
			else if (bInc == false && cur -1 == next) {
				cur =next;
			}
			else {
				System.out.println("mixed");
				return;
			}
		}
		
		if (true == bInc) {
			System.out.println("ascending");
		}
		else {
			System.out.println("descending");
		}
	}

}
