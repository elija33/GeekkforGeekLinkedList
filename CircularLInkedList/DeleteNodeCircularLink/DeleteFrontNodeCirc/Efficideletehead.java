package CircularLInkedList.DeleteNodeCircularLink.DeleteFrontNodeCirc;

public class Efficideletehead {
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
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = head;
        printlist(head);
        head = delethead(head);
    }
}
