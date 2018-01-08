package chapter3;

//8993. 합
// https://www.acmicpc.net/problem/8393

import java.util.*;

public class M8393 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int sum = 0;
        for (int i = 1 ; i<=n;i++) {
        	sum += i;
        }
        System.out.println(sum);
        
	}
}
