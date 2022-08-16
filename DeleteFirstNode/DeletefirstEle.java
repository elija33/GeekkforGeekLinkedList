package DeleteFirstNode;

public class DeletefirstEle {
     public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
     }

     public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(25);
        head.next.next = new Node(30);
        printlist(head);
        head = delHead(head);
        printlist(head);
     }

     public static Node delHead(Node head){
        if(head == null){
            return null;
        }
        else{
            return head.next;
        }
     }

     public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
     }
}
