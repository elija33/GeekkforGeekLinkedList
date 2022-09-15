package LinkedListInsert;

public class InsetNodeAtEnd {
    Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int k) {
            data = k;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(22);
        head.next.next = new Node(25);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(35);
        head.next.next.next.next.next = new Node(40);
        InsetNodeAtEnd last = new InsetNodeAtEnd();
        last.append(45);
        System.out.println();
    }

    /*
     * Appends a new node at the end. This method is defined inside LinkedList class
     * show above
     */

    public void append(int newdata) {

        /*
         * Allocate the Node
         * Put in the data
         * Set next as null
         */

        Node newnode = new Node(newdata);

        // check if the Linked list is empty, then we make new node as head
        if (head == null) {
            head = new Node(newdata);
            return;
        }

        // The new node is going to be the last and end of the linkedlist, therefore the
        // nuul is going to be the end.

        newnode.next = null;

        // Else if the linked is not empty, traverse untill the end of the linkedlist
        Node last = head;
        while (last.next != null) {
            last = last.next;

            // change the next of last node.
            last.next = newnode;
            return;
        }
    }
}
