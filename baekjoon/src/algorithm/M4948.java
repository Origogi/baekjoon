import java.util.*;

// 4948. 공준
// https://www.acmicpc.net/problem/4948

public class M4948 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }

            int start = n;
            int end = n * 2;

            int[] array = new int[end + 1];

            for (int i = 0; i <= end; i++) {
                array[i] = i;
            }

            array[0] = 0;
            array[1] = 0;

            int target = (int) Math.sqrt(end);
            for (int i = 2; i <= target; i++) {
                if (array[i] == 0) {
                    continue;
                }

                for (int j = i + i; j <= end; j = j + i) {
                    array[j] = 0;
                }
            }

            int count = 0;
            for (int i = start + 1; i <= end; i++) {
                if (0 != array[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();

    }
}
