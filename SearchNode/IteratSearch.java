package SearchNode;

public class IteratSearch {
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
        head.next.next.next.next = new Node(32);
        head.next.next.next.next.next = new Node(35);
        head.next.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next.next = new Node(45);
        printlist(head);

        // The element we are looking for
        System.out.println("Position of element in linked list: " + search(head, 35));
    }

    // Searching for the element in linked list
    public static int search(Node head, int target) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == target) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    // Printing out all the element in the linked list
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}
