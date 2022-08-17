package LinkedListInsert;

public class InsetNodeAtEnd {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int k){
            data = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(20);
        Node first = new Node(22);
        Node second = new Node(25);
        Node third = new Node(30);
        Node four = new Node(35);
        Node five = new Node(40);
        InsetNodeAtEnd last = new InsetNodeAtEnd();
        last.append(45);

        head.next = head;
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        System.out.println(head+"->" + first+"->" + second+"->" + third+"->" + four+"->" + five);
        System.out.println();
    }

    /* Appends a new node at the end. This method is defined inside LinkedList class show above */

    public void append(int newdata){

        /* Allocate the Node
           Put in the data
           Set next as null */

           Node newnode = new Node(newdata);

    // check if the Linked list is empty, then we make new node as head
           if(head == null){
            head = new Node(newdata);
                return;
           }

    // The new node is going to be the last and end of the linkedlist, therefore the nuul is going to be the end.

           newnode.next = null;

    // Else if the linked is not empty, traverse untill the end of the linkedlist 
           Node last = head;
           while(last.next != null){
            last = last.next;
        
        // change the next of last node.
            last.next = newnode;
            return;
           }
    }
}
