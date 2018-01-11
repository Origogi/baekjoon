package algo;

import java.util.Scanner;

//8958 OX퀴즈
// https://www.acmicpc.net/problem/8958

public class M8958 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            String str = scan.next();
            int score = 0;
            int sum = 0;
            for (int i = 0;i<str.length();i++) {
            	if( 'O' ==  str.charAt(i)) {
            		score++;
            		sum += score;
            	}
            	else {
            		score =0;
            	}
            }
            System.out.println(sum);
            T--;
        }
        scan.close();


	}
}
