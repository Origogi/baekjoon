package algo;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1577. 단어공부
 *  https://www.acmicpc.net/problem/2577
 */

public class M1577 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next().toUpperCase();
    	HashMap<Character, Integer> map = new HashMap<>();
    	
    	int maxCount = 0;
    	boolean bUnique = false;
    	char candidate = '?'; 
    	
    	for (int i = 0; i < str.length();i++) {
    		char c = str.charAt(i);
    		if (false == map.containsKey(c)) {
    			map.put(c, 0);
    		}
    		int count = map.get(c);
    		count++;
    		map.put(c, count);
    		
    		if (count > maxCount) {
    			bUnique = true;
    			candidate = c;
    			maxCount = count;
    		}
    		else if (maxCount == count) {
    			bUnique = false;
    		}
    	}
    	
    	if (false == bUnique) {
    		candidate = '?';
    	}
    	System.out.print(candidate + "");
    }
}
