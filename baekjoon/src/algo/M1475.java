package algo;

import java.util.*;

/*
 * 1425. 방 번호 
 *  https://www.acmicpc.net/problem/1425
 */

public class M1475 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        int[] array = new int[10];

        int c = input.length();
        while (c>0) {
            int element = Integer.parseInt(input.charAt(c-1) + "");
            if (element !=6 && element != 9) {
                array[element] ++;
            }
            else {
                if (array[6] > array[9]) {
                    array[9]++;
                }
                else {
                    array[6]++;
                }
            }
            c--;
        }
        int max = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
