package LinkedList;

public class InsetGivenNode {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int t){
            data = t;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(12);
        Node second = new Node(14);
        Node thrid = new Node(16);
        Node four = new Node(18);
        Node five = new Node(20);
        Node six = new Node(22);

        System.out.println(head+"->" + first+"->" + second+"->" + thrid+"->" + 
                    four+"->" + five+"->" + six);
    }
    
}
