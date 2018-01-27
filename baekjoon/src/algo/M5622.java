package algo;

//5622. 다이얼
//https://www.acmicpc.net/problem/5622
import java.util.Scanner;

public class M5622 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] dial = { 3, 3 ,3, 4, 4, 4, 5, 5,5, 6,6,6,7,7,7, 8,8,8,8,9,9,9, 10,10,10,10};
        int result = 0;
        for (int i = 0;i< input.length();i++) {
            char c = input.charAt(i);

            
            int dist = c - 'A';

            result += dial[dist];
            
        }
        System.out.println(result);
    }
}
