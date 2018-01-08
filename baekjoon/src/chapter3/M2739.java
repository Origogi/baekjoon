package chapter3;


// 2739. 구구단
// https://www.acmicpc.net/problem/2739

import java.util.*;

public class M2739 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }

}
