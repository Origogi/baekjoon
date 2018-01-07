package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;


/* 단어 정렬 
 * 
 * https://www.acmicpc.net/problem/1181
 */

public class M1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i= 0; i< size;i++) {
			list.add(scan.next());
		}
		
		scan.close();
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				return o1.compareTo(o2);
			}
		};

		Collections.sort(list, comparator);
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		
		for (String item : set) {
			System.out.println(item);
		}
	}
}
