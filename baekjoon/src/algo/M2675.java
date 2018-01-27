package algo;

import java.util.Scanner;

//2675. 문자열 반복
//https://www.acmicpc.net/problem/2675

public class M2675 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T>0) {
            int count = scan.nextInt();

            String word = scan.next();
            for (int i = 0 ;i< word.length();i++) {
                for (int j =0 ;j <count;j++ ) {
                    System.out.print(word.charAt(i));
                }
            }
            System.out.println();
            
            T--;
        }
    }

}
