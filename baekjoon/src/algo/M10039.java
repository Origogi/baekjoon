package algo;

import java.util.Scanner;

//10039. 평균점수
//https://www.acmicpc.net/problem/10039

public class M10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i<5;i++) {
			int score = scan.nextInt();
			if (score < 40) {
				score =40;
			}
			sum += score;
		}
		scan.close();
		System.out.print(sum/5);
		
	}

}
