package CircularLInkedList.TraversalCirclarLinkedList;

public class DoWhileTraversal {
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
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = head;

        printlist(head);
    }

    public static void printlist(Node head){
        if(head == null)
        return;

        Node cur = head;

        do{
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        while(cur != head);
    }
}
