package algo;

import java.util.Scanner;

//1110. 더하기 싸이클
//https://www.acmicpc.net/problem/1110

public class M1110 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();

        int a;
        int b;
        if (start < 10) {
            a = 0;
            b = start;
        }
        else {
            a = start / 10;
            b = start % 10;
        }
        int c = a + b;
        int next = b * 10 + c % 10;
        int count = 1;
        while (start != next) {
            a = next / 10;
            b = next % 10;
            c = a + b;
            next = b * 10 + c % 10;
            count++;
        }
        System.out.println(count);
    }

}
