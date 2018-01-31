package algo;

import java.util.Scanner;

//10866. 덱
//https://www.acmicpc.net/problem/10866

public class M10866 {

	static class Node {
		int data;
		Node next;
		Node prev;

		
		Node (int data) {
			this.data =data;
		}
	}
	
	static int size = 0;
	
	static Node head;
	static Node tail;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		while (T > 0) {
			String op = scan.next();
			
			if ("push_back".equals(op)) {
				Node tmp = new Node(scan.nextInt());
				if (size == 0) {
					head = tmp;
					tail = tmp;
				}
				else {
					tail.next = tmp;
					tmp.prev = tail;
					tail = tmp;
				}
				size++;
			}
			else if ("push_front".equals(op)) {
				Node tmp = new Node(scan.nextInt());

				if (size == 0) {
					head = tmp;
					tail = tmp;
				}
				else {
					head.prev = tmp;
					tmp.next = head;
					head = tmp;
				}
				size++;

			}
			else if ("size".equals(op)) {
				System.out.println(size);
			}
			else if ("empty".equals(op)) {
				System.out.println(size > 0 ? 0 : 1);
			}
			else {
				if (size == 0) {
					System.out.println(-1);
					T--;
					continue;
				}
				
				if ("pop_back".equals(op)) {
					System.out.println(tail.data);
					if (size == 1) {
						
						head = null;
						tail = null;
					}
					else {
						tail.prev.next = null;
						tail = tail.prev;
					}

					size--;
				}
				else if ("pop_front".equals(op)) {
					System.out.println(head.data);
					if (size == 1) {
						
						head = null;
						tail = null;
					}
					else {
						head.next.prev = null;
						head = head.next;
					}
					size--;
				}
				else if ("front".equals(op)) {
					System.out.println(head.data);
				}
				else if ("back".equals(op)) {
					System.out.println(tail.data);
				}
			}

			T--;
		}
		
	}
}
