import java.util.*;

/* 9020. 소수 구하기
https://www.acmicpc.net/problem/9020
*/
public class M9020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            int end = scan.nextInt();

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

            int resultA = 0;
            int resultB = 0;
            for (int i = 2; i <= (end / 2) + 1; i++) {
                if (0 == array[i]) {
                    continue;
                }

                if (0 != array[end - array[i]]) {
                    resultA = array[i];
                    resultB = array[end - array[i]];
                }
            }
            if (resultA > resultB) {
                System.out.println(resultB + " " + resultA);
            }
            else {
                System.out.println(resultA + " " + resultB);
            }
        }
    }
}
