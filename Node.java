public class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

class Test {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(35);
        head.next.next.next.next = head;
        head = insertBegin(head, 15);
        printlist(head);

    }

    public static void printlist(Node head) {
        if (head == null)
            return;
        Node sum = head;
        do {
            System.out.print(sum.data + "->");
            sum = sum.next;
        } while (sum != head);
    }

    // Inserting an element at the beging of linkedlist
    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            temp.next = temp;
        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }
}
