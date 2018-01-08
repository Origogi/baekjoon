package algorithm;


import java.util.*;

/* 1929. 소수 구하기
https://www.acmicpc.net/problem/1929
*/
public class M1929 {

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

        for (int i = start; i<= end;i++) {
            if (0 == array[i]) {
                continue;
            }

            System.out.println(array[i]);
        }

    }
}
