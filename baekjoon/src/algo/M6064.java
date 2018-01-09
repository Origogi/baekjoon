package algo;


//6064. 카잉달력
//https://www.acmicpc.net/problem/6064


import java.util.Scanner;

public class M6064 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int T = scan.nextInt();

        while (T > 0) {
            int M = scan.nextInt();
            int N = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int maxYear = lcm(M, N);
            int curN = 0;
            int resultYear = 0;

            curN = x;

            curN = curN % N;
            if (curN == 0) {
                curN = N;
            }

            resultYear += x;

            while (resultYear <= maxYear) {
                if (y == curN) {
                    break;
                }

                curN += M;
                curN = curN % N;
                if (curN == 0) {
                    curN = N;
                }

                resultYear += M;
            }
            if (resultYear > maxYear) {
                System.out.println(-1);
            }
            else {
                System.out.println(resultYear);
            }
            T--;
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }

    static int lcm(int a, int b) {
        return (a * b / gcd(b, a % b));
    }

}
