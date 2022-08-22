package CircularLInkedList;

public class CirculareLinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println("This is a circulare linked list");

        Node head = new Node(10);
        Node first = new Node(15);
        Node second = new Node(20);
        Node third = new Node(25);
        Node four = new Node(30);
        Node five = new Node(35);
        Node six = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        six.next = head;

        System.out.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data+"->" + four.data+"->" + 
            five.data+"->" + six.data+"->");
    }
}
