package TraversigLinkedList;

public class Tracerslinke {

    public static class Node {
        int data;
        Node next;

        public Node(int k) {
            data = k;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(30);
        head.next = new Node(31);
        head.next.next = new Node(35);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(42);
        head.next.next.next.next.next = new Node(45);
        printlist(head);
    }

    // Printing out all the element in teh linkedlist
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
}
