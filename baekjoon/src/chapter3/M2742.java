package chapter3;

import java.util.Scanner;

//2742. 기찍 N
//https://www.acmicpc.net/problem/27412

public class M2742 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for (int i = n;i>0;i--)
            System.out.println(i);
    }
}
