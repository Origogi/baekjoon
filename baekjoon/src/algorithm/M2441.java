// 2441. 별 찍기 -4
// https://www.acmicpc.net/problem/2441

import java.util.*;


public class M2441 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        scan.close();
        for (int i = 0;i<h;i ++) {
            for (int j = 0;j < i;j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <(h-i) ;k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
