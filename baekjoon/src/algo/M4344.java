package algo;

import java.util.Scanner;

//4344. 평균은 넘겠지
//https://www.acmicpc.net/problem/4344

public class M4344 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
        
            int n = scan.nextInt();
            int[] array = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
                sum += array[i];
            }
            double avg = sum / n;
            double result = 0;
            int count = 0;
          //  System.out.println("avg " + avg + " sum " + sum);
            for (int i = 0; i < n; i++) {
                if (avg < array[i]) {
                    count++;
                }
            }
            result = (double) count / (double) n * 100;
            result = Math.round(result * 1000d)/ 1000d;
            System.out.printf("%.3f%% \n", result);            
            T--;
        }
    }
}
