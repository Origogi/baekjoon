package algo;

//https://www.acmicpc.net/problem/1260
//1260.DFS 와 BFS

import java.util.*;

public class M1260 {

	static int[][] map;	
	static int vCount;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		vCount = scan.nextInt();
		map = new int[vCount+1][vCount+1];

		int eCount = scan.nextInt();
		int vStart = scan.nextInt();

		for (int i =0;i<eCount;i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();

			map[v1][v2] = 1;
			map[v2][v1] = 1;
			
		}
		scan.close();
		
		findDFS(vStart);
		System.out.println();
		findBFS(vStart);
	}

	private static void findDFS(int vStart) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(vStart);
		int[] vCheck = new int[vCount + 1];
		vCheck[vStart] = 1;

		dFS(stack, vCheck);

	}
	
	static void dFS(Stack<Integer> stack, int[] vCheck) {
		
		int vCur = stack.pop();
		System.out.print((vCur) + " ");

		for (int i = 1; i< map.length;i++) {
			if (map[vCur][i] == 1 && vCheck[i] == 0) {
				vCheck[i] = 1;
				stack.push(i);
				dFS(stack, vCheck);
			}
		}
		
	}
	
	private static void findBFS(int vStart) {

		int[] vCheck = new int[1001];
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(vStart);
		vCheck[vStart] = 1;

		
		while (!queue.isEmpty()) {
			int vCurrent = queue.remove();
			System.out.print((vCurrent) + " ");

			for (int i = 0; i< map.length;i++) {
				if (map[vCurrent][i] !=0 && vCheck[i] == 0) {
					vCheck[i] = 1;
					queue.add(i);
				}
			}
		}
	}
}
