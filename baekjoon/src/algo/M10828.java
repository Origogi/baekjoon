package algo;

//https://www.acmicpc.net/submit/10828/
//10828. 스택


import java.util.Scanner;

public class M10828 {

    static class Node {
        int index;
        int data;
        Node prev;
    }
    
    static Node head;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        while (T > 0) {
            String op = scan.next();
            
            if (op.equals("push")) {
                push(scan.nextInt());
            }
            else if (op.equals("top")) {
                if (head == null) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(head.data);
                }
            }
            else if (op.equals("empty")) {
                if (head == null) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if (op.equals("pop")) {
                if (head == null) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(pop().data);
                }
                
            }
            else if (op.equals("size")) {
                if (head == null) {
                    System.out.println(0);
                }
                else {
                    System.out.println(size());
                }
            }
            else {
                System.out.println("invalid OP " + op);
            }
            
            
            
            T--;
        }
        

    }
    
    static Node pop () {
        Node node = head;
        head = node.prev;
        
        return node;
    }
    
    static void push (int n) {
        Node node = new Node();
        node.data = n;
        if (head == null) {
            node.index = 0;
        }
        else {
            node.index = head.index + 1;
            node.prev = head;
        }
        
        head = node;
    }
    
    static int size() {
        return head.index+ 1;
    }

}
