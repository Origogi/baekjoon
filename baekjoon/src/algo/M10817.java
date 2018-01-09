package algo;

import java.util.*;

public class M10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] array = new int[3];
		for (int i =0;i<3;i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(array);
		System.out.print(array[1]);
	}

}
