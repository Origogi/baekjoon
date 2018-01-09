package algo;

import java.util.Scanner;

// 11720. 숫자의 합
// https://www.acmicpc.net/problem/11720

public class M11720 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        String input = scan.next();
        scan.close();

        int sum = 0;
        for (int i = 0; i< input.length();i++) {
        	sum += Character.getNumericValue(input.charAt(i));
        }
        System.out.print(sum);
	}

}
