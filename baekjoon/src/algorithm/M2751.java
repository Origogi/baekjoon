import java.util.Scanner;
// 2751.  정렬하기
// https://www.acmicpc.net/problem/2751

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int size;
        size = scan.nextInt();
        int[] array = new int[size];
        
        for (int i = 0;i < size ;i ++) {
            array[i] = scan.nextInt();
        }

        quickSort(0, size-1, array);
        
        for (int i = 0;i < size ;i ++) {
            System.out.println(array[i]);
        }

    }
    
    static void quickSort(int left, int right, int[] array) {

        int start = left;
        int end = right;
        int pivot = array[(start + end)/2];
        
        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int tmp = array[start];
                array[start] = tmp;
                array[start] = array[end];
                array[end] = tmp;
                start++;
                end--;
            }
        }
        
        if (start < right) {
            quickSort(start, right, array);
        }
        if (left < end) {
            quickSort(left, end, array);
        }
    }

}
