package algo;

import java.util.Scanner;

/* 1011. Fly me to the Alpha Centauri
 * https://www.acmicpc.net/problem/1011
 */

public class M1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while (T > 0) {
			int dist = Math.abs(scan.nextInt() - scan.nextInt());
			int count = 0;
			int root = (int) Math.sqrt(dist);

			
			for (int i = 1;2*i < dist;i++) {
				dist = dist - 2*i;
				count+=2;
			}
			//System.out.println(count + "/" + dist);

			if (dist != 0) {
				count += (dist/root);
				dist = dist%root;
			}
			
			if (dist !=0) {
				count++;
			}
			
			System.out.println(count);
			T--;
		}
		scan.close();
	}
		
		
}
