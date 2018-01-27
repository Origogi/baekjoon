package algo;

//2941. 크로아티아 알파벳
//https://www.acmicpc.net/problem/2941

import java.util.ArrayList;
import java.util.Scanner;



public class M2941 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> kroatiaAlphabatList = new ArrayList<>();
        kroatiaAlphabatList.add("c=");
        kroatiaAlphabatList.add("c-");
        kroatiaAlphabatList.add("dz=");
        kroatiaAlphabatList.add("d-");
        kroatiaAlphabatList.add("lj");
        kroatiaAlphabatList.add("nj");
        kroatiaAlphabatList.add("s=");
        kroatiaAlphabatList.add("z=");
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        
        int result =0;
        
        while (false == str.isEmpty()) {
            boolean bFindK = false;
            for (String element : kroatiaAlphabatList) {
                if (true == str.startsWith(element)) {
                    str = str.substring(element.length());
                    result++;
                    bFindK = true;
                    break;
                }
            }
            
            if (false ==bFindK) {
                result++;
                str = str.substring(1);
            }
        }
        
        System.out.println(result);
        
    }

}
