package CircularLInkedList.InsertNodeCircularLink.InsertNodeEndCircular;

public class NaiveInsertatEnd {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int k){
            data = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(9);
        head.next.next = new Node(7);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = head;
        head = insertNodeAtEnd(head, 1);
        printlist(head);
    }

    public static void printlist(Node head){
        if(head == null)
        return;
        Node curr = head;
        do{
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        while(curr != head);
    }
    
    public static Node insertNodeAtEnd(Node head, int givenumber){
        Node temp = new Node(givenumber);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            Node curr = head;
            while(curr.next != head)
            curr = curr.next;
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }
}
