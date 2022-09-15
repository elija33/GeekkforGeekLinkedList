package TraversigLinkedList;

public class RecursiveTraversing {

    public static class Node {
        int data;
        Node next;

        public Node(int k) {
            data = k;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(22);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = new Node(30);
        printlist(head);
    }

    // Printing out the element in the linked list
    public static void printlist(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + "->");
        printlist(head.next);
    }

}
