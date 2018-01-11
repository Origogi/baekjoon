package algo;

import java.util.*;

//1152. 단어의 개수
//https://www.acmicpc.net/problem/1152

public class M1152 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        
        if (true == input.isEmpty()) {
            System.out.println(0);
            return;
        }

        StringTokenizer stn = new StringTokenizer(input, " ");
        int result = 0;
        while (stn.hasMoreTokens()) {
            stn.nextToken();
            result++;
        }
        System.out.println(result);
    }
}


