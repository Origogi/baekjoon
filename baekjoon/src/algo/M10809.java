package algo;

//10809. 알파벳 찾기
// https://www.acmicpc.net/problem/10809

import java.util.Scanner;

public class M10809 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int[] result = new int[26];
        for (int i = 0 ;i < 26;i++) {
            result[i] = -1;
        }
        
        char a = 'a';
        
        for (int i = 0; i<input.length();i++) {
            char element = input.charAt(i);
            int place = element - a;
            if (-1 == result[place]) {
                result[place] = i;
            }
        }

        for (int i = 0 ;i < 26;i++) {
            System.out.print(result[i] + " ");
        }
    }

}
