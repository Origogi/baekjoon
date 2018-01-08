package algorithm;


import java.util.*;

// 2438. 별 찍기 - 1
// https://www.acmicpc.net/problem/2438

public class M2438 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        
        for (int i = 0; i<h ;i++) {
            for (int j = 0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
