package DobleLinkelist.ReversalDoub;

import java.util.List;

public class ReversalDoubllinked {
    static Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printlist(Node node){
        while(node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        ReversalDoubllinked rever = new ReversalDoubllinked();
        rever.head = new Node(20);
        rever.head.next = new Node(25);
        rever.head.next.next = new Node(30);
        rever.head.next.next.next = new Node(35);

        System.out.println("Given Linked list");
        rever.printlist(head);
        head = rever.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        rever.printlist(head);
    }
}
