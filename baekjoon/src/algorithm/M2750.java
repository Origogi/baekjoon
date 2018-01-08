
package algorithm;


import java.util.Scanner;

/* 2750.  정렬하기
https://www.acmicpc.net/problem/2750
*/

public class M2750 {
    //Bubble sort
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int size;
        size = scan.nextInt();
        int[] array = new int[size];
        
        for (int i = 0;i < size ;i ++) {
            array[i] = scan.nextInt();
        }
        
        for (int i = 0;i < size  ;i ++) {
            for (int j= 0; j <size - i -1;j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        
        for (int i = 0;i < size ;i ++) {
            System.out.println(array[i]);
        }
	}

}
