package algo;


//1316. 그룹 단어 체커
//https://www.acmicpc.net/problem/1316
import java.util.*;

public class M1316 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int result =0;
        while (T>0) {
            String input = scan.next();
            HashMap<Character, Integer> map = new HashMap<>();
            char c = input.charAt(0);
            map.put (c,0);
            
            boolean isG = true;
            for (int i = 1; i< input.length();i++) {
                if (c == input.charAt(i)) {
                    continue;
                }
                else {
                    if (true == map.containsKey(input.charAt(i))) {
                        isG = false;
                        break;
                    }
                    else {
                        c = input.charAt(i);
                        map.put(c,0);
                    }
                }
            }
            if (true == isG) {
                result++;
            }
            
            T--;
        }
        System.out.println(result);
    }

}
