package algo;


// 2439. 별 찍기
// https://www.acmicpc.net/problem/2439

import java.util.*;


public class M2439 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        scan.close();
        for (int i = 1;i<=h;i ++) {
            for (int j = (h- i);j > 0;j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
