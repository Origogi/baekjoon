package algo;

import java.util.Scanner;

//2839.  설탕 배달
//https://www.acmicpc.net/problem/2839

public class M2839 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int remain = n;
    	scan.close();

    	int fivePoket = 0;
    	int threePoket = 0;
    	
    	while (remain > 0) {
    		if (remain % 5 == 0) {
    			fivePoket += remain /5;
    			remain = 0;
    			break;
    		}
	
    		remain -= 3;
    		threePoket++;
    	}
    	
    	if (remain == 0) {
    		System.out.print(threePoket + fivePoket);
    	}
    	else {
    		System.out.print(-1);
    	}
    }
}
