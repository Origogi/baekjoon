package algo;

//10845. 큐
//https://www.acmicpc.net/problem/10845

import java.util.Scanner;

public class M10845 {

    static class Node 
    {
        public Node(int data) {
            this.data = data;
        }
        Node next;
        int data;
    }
    
    static Node head;
    static Node near;
    static int size = 0;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T >0) {
            String op = scan.next();
            
            if (op.equals("push")) {
                int data = scan.nextInt();
                Node node = new Node(data);
                if (size == 0) {
                    head = node;
                    near = node;
                    size++;
                    T--;

                    continue;
                }
                size++;

                near.next = node;
                near = node;
            }
            else if (op.equals("pop")) {
                if (size == 0) {
                    System.out.println(-1);
                    T--;

                    continue;
                }
                
                Node tmp = head;
                head = tmp.next;
                tmp.next = null;
                System.out.println(tmp.data);
                size--;
            }
            else if (op.equals("size")) {
                System.out.println(size);
            }
            else if (op.equals("empty")) {
                System.out.println(size == 0? 1:0);
            }
            else if (op.equals("front")) {
                System.out.println(size != 0? head.data:-1);

            }
            else if (op.equals("back")) {
                System.out.println(size != 0? near.data:-1);

            }
            
            T--;
        }
        
    }

}
