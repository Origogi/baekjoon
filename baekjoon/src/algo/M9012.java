package algo;

import java.util.Scanner;
import java.util.Stack;

//9012. 괄호
//https://www.acmicpc.net/problem/9012

public class M9012 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        
        while (T > 0) {
            String input = scan.next();
            
            Stack<Character> stack = new Stack<>();
            int index = 0;
            
            while (index < input.length()) {
                char c = input.charAt(index);
                if (stack.isEmpty()) {
                    if ('(' == c) {
                        stack.push(c);
                    }
                    else {
                        break;
                    }
                    index++;
                    continue;
                }
                
                if ('(' == c) {
                    stack.push(c);
                }
                else {
                    stack.pop();
                }
                index++;
            }

            if (index == input.length() && stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            T--;
        }
    }

}
