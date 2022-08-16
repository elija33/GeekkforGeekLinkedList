package TraversigLinkedList;

public class RecursiveTraversing {

    public static class Node{
        int data;
        Node next;

        public Node(int k){
            data = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node five = new Node(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

        System.out.println(head.data+"->" + second.data+"->" + third.data+"->" + fourth.data+"->" + five.data);
        System.out.println();

        printlist(head);
    }
    public static void printlist(Node head) {
        if(head == null){
            return;
        }
        System.out.println(head.data+ " ");
        printlist(head.next);
    }
    
}
