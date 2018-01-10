package algo;

import java.util.Scanner;

/*
 * 1546. 평균
 *  https://www.acmicpc.net/problem/1546
 */

public class M1546 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] array = new int[n];
        int maxScore = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            if (array[i] > maxScore) {
                maxScore = array[i];
            }
        }
        scan.close();
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += (double) array[i] / maxScore * 100;
        }
        result /= n;
        result = Double.parseDouble(String.format("%.2f",result));

        System.out.println(result);
    }

}
