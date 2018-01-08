package etc;

import java.util.Scanner;

/* 1002. 터렛
https://www.acmicpc.net/problem/1002
*/

public class M1002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        int[] arrayResult = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int A_x = scan.nextInt();
            int A_y = scan.nextInt();
            int A_r = scan.nextInt();

            int B_x = scan.nextInt();
            int B_y = scan.nextInt();
            int B_r = scan.nextInt();

            if ((A_x == B_x) && (A_y == B_y)) {
                if (A_r == B_r) {
                    arrayResult[i] = -1;
                    continue;
                }
                else {
                    arrayResult[i] = 0;
                    continue;
                }
            }

            double dist = Math.sqrt(Math.pow((A_x - B_x), 2) + Math.pow((A_y - B_y), 2));

            if (dist == (A_r + B_r) || dist == Math.abs(A_r - B_r)) {
                arrayResult[i] = 1;
                continue;
            }

            if (dist > A_r + B_r || dist < Math.abs(A_r - B_r)) {
                arrayResult[i] = 0;
                continue;
            }

            arrayResult[i] = 2;
        }
        scan.close();
        
        for (int i=0; i < testCase ;i++) {
            System.out.println(arrayResult[i]);
        }
    }
}
