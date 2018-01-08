package algorithm;


import java.util.*;

/* 2581. 소수 구하기
https://www.acmicpc.net/problem/2581
*/

public class M2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        scan.close();

        int[] array = new int[end + 1];
        
        for (int i = 0;i<=end;i++) {
            array[i] = i;
        }

        array[0] = 0;
        array[1] = 0;

        int target = (int) Math.sqrt(end);
        for (int i = 2; i <= target;i++) {
            if (array[i] == 0) {
                continue;
            }
            
            for (int j = i + i; j <= end; j = j+ i) {
                array[j] = 0;
            }
        }

        int sum = 0;
        int minimum = 0;
        for (int i = start; i<= end;i++) {
            if (0 == array[i]) {
                continue;
            }
            
            if (0 == minimum ) {
                minimum = array[i];
            }
            sum += array[i];
        }
        
        if (sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(minimum);
        }
    }
}
