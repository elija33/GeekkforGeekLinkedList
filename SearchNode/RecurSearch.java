package SearchNode;

public class RecurSearch {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(35);
        printlist(head);

        // The element we are looking for
        System.out.println("Position of element in linked list: " + search(head, 20));
    }

    // The searching method in linked list
    public static int search(Node head, int target) {
        if (head == null) {
            return -1;
        }
        if (head.data == target) {
            return 1;
        } else {
            int res = search(head.next, target);
            if (res == -1)
                return -1;
            else
                return res + 1;
        }
    }

    // Printing out all the element in linked list
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}
