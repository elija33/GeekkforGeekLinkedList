package CircularLInkedList.DeleteNodeCircularLink.DeleteFrontNodeCirc;

public class NaiveDeleteHead {
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
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = head;
        printlist(head);
        head = deletehead(head);
        System.out.println("This is linked list");
    }

    public static void printlist(Node head){
        if(head == null)
        return;
        Node list = head;
        do{
            System.out.print(list.data+"->");
            list = list.next;
        }
        while(list != head);
    }

    public static Node deletehead(Node head) {
        if(head == null)
            return null;
        if(head.next == head)
             return null;
       Node curr = head;
       while(curr.next != head)
        curr = curr.next;
        curr.next = head.next;
       return (curr.next);
    }
    
}
