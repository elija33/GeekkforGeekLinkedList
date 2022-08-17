package LinkedListInsert;

public class InsetNodeFront {
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

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;

        System.out.println(head.data+"->" + second+"->" + third+"->" + four);
            System.out.println();
    }

    //Adding a node at the front of the linkedlist
    public void pust(int newdata){
        
    // Allocat the node and put in the data
        Node newnode = new Node(newdata);

    // Make next of new Node as head
        newnode.next = head;
    
    // Move the head to point to new Node
        head = newnode;
    }
}
