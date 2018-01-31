package algo;

import java.util.*;

//1021. 회전하는 큐
//https://www.acmicpc.net/problem/1021

public class M1021 {
	static Queue<Integer> targetQueue = new LinkedList<>();  //뽑아야 하는 아이템을  저장
	static Deque<Integer> deque = new LinkedList<>();        // circular queue를 위해 deque을 만듬


	static final int LEFT = 0;
	static final int RIGHT = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int dequeSize = scan.nextInt();
		int targetSize = scan.nextInt();
		
		for (int i = 0 ;i < dequeSize;i++) {  //deque 초기화
			deque.add(i + 1);
		}
		
		for (int i = 0;i<targetSize;i++) {
			targetQueue.add(scan.nextInt());  // target 저장
		}
		
		int result =0;   // 최소 이동 횟수 저장
		
		while (!targetQueue.isEmpty()) {  // 타겟이 모두 없어 질 때 까지
			int target = targetQueue.remove(); // 타겟을 하나 뽑는다
			
			Deque<Integer> leftDeque = copy();   //왼쪽으로 돌았을 때 덱의 상태를 저장함
			Deque<Integer> rightDeque = copy();   // 오른쪽으로 돌았을 때 덱의 상태를 저장함

			int leftCount = search(LEFT, leftDeque, target);   //왼쪽으로 돌면서 검색
			int rightCount = search(RIGHT, rightDeque, target);  //오른쪽으로 돌면서 검색

			if (leftCount < rightCount) {   // 왼쪽으로 도는 게 오른 쪽으로 도는 것보다 적게 이동한 경우 다음 루프에서는 레프트덱으로 돈다. 
				deque = leftDeque;
				result += leftCount;
			}
			else {
				deque = rightDeque;
				result += rightCount;
			}
			deque.removeFirst();
			
		}
		System.out.print(result);
		
	}


	private static int search(int direction, Deque<Integer> tmpDeque, int target) {  
		
		int count = 0;
		while (tmpDeque.getFirst() != target) {  //deque의 first가 타겟과 같을 때 까지 회전
 			if (direction == RIGHT) {   
				tmpDeque.addLast(tmpDeque.removeFirst());  //First을 기준으로 오른 쪽으로 도는 코드
			}
			else {
				tmpDeque.addFirst(tmpDeque.removeLast());  //First를 기준으로 왼쪽으로 도는 코드
			}
			count++;
		}

		return count;
	}


	private static Deque<Integer> copy() {   //덱을 카피
		Deque<Integer> tmp = new LinkedList<>();
		
		Iterator<Integer> it = deque.iterator();
	
		while (it.hasNext()) {
			tmp.add(it.next());
		}
		return tmp;
	}

}
