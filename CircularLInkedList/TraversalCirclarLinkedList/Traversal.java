package CircularLInkedList.TraversalCirclarLinkedList;


public class Traversal {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int date){
            data = date;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(25);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(35);
        head.next.next.next.next.next.next.next = head;

        System.out.println(head.data+"->" + head.next.data+"->" + head.next.next.data+"->" + head.next.next.next.data+"->" + 
                            head.next.next.next.next.data+"->" + head.next.next.next.next.next.data+"->" + head.next.next.next.next.next.next.data);
            printlist(head);
         }

         //check if head is null than return ""
         public static void printlist(Node head){
            if(head==null)return;
            System.out.print(head.data+" ");

        //for loop to start from second postion, when the linked comes back to head we stop.
            for(Node r=head.next;r!=head;r=r.next)
                System.out.print(r.data+" ");
        }
}
