package TraversigLinkedList;

public class Tracerslinke {

    public static class Node{
        int data;
        Node next;

        public Node(int k){
            data = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(30);
        Node second = new Node(35);
        Node third = new Node(50);
        Node four = new Node(2);

        head.next = second;
        second.next = third;
        third.next = four;

        System.out.println(head.data+"->" + second.data+"->" + third.data+"->" + four.data);
         System.out.println();

         printlist(head);
    }

    public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
    }
    
}
