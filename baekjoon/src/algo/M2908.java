package algo;

//2908.상수
//https://www.acmicpc.net/problem/2908

import java.util.Scanner;

public class M2908 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        
        String result = "";
        for (int i = 2; i>=0;i--) {
            if (A.charAt(i) > B.charAt(i)) {
                result = A;
                break;
            }
            else if (A.charAt(i) < B.charAt(i)) {
                result = B;
                break;
            }
        }
        
        for (int i = 2; i>=0;i--) {
            System.out.print(result.charAt(i));
        }
    }

}
