package algo;

//2755.  부녀회장이 될테야
//https://www.acmicpc.net/problem/2755

import java.util.Scanner;

public class M2775 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            
            int k = scan.nextInt();
            int n = scan.nextInt();
            int[] array = new int[n];
            
            for (int i = 0;i<n;i++) {
                array[i] = i +1;
            }
            
            for (int i = 1;i<=k;i++) {
                for (int j = 1;j<n;j++) {
                    array[j] = array[j-1] + array[j];
                }
            }
            System.out.println(array[n-1]);
            T--;
        }
        scan.close();

    }

}
