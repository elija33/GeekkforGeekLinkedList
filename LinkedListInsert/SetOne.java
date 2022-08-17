package LinkedListInsert;

public class SetOne {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int date){
            data = date;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(15);
        Node second = new Node(20);
        Node third = new Node(25);
        Node four = new Node(30);
        Node five = new Node(35);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        System.out.println(first+"->" + second+"->" + third+"->" + four+"->" + five);
    }
}
