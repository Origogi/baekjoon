// 2440. 별 찍기 -3
// https://www.acmicpc.net/problem/2440

import java.util.*;


public class M2440 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        scan.close();
        for (int i = 1;i<=h;i ++) {
            for (int k = 1; k <=(h-i + 1) ;k++) {
                System.out.print("*");
            }
            for (int j = 0;j < i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
