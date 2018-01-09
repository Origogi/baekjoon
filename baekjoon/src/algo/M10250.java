package algo;

import java.util.Scanner;

/* 10250. ACM 호텔
 * https://www.acmicpc.net/problem/10250
 */


public class M10250 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T >0) {
            int H = scan.nextInt();
            scan.nextInt();
            int num = scan.nextInt();
            int ho = ((num/H)+1) + (num%H) * 100;
            if (num%H == 0 ) {
                ho += H*100;
                ho--;
            }
            System.out.println(ho);
            T--;
        }
        scan.close();
    }

}
