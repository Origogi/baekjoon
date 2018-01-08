import java.util.*;

// 2292. 벌집
// https://www.acmicpc.net/problem/2292

public class M2292 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        scan.close();
        int r = 1;
        int lastRoom = 1;

        while (target > lastRoom) {
            lastRoom += 6*r;
            r++;
        }
        System.out.println(r);
    }

}
