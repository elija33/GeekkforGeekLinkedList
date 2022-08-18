package DobleLinkelist.dobleLinkedList;

public class DoblelinkedImple {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int d){
            data = d;
            next = null;
            prev = null;
        }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(15);
        Node second = new Node(20);
        Node third = new Node(25);

        head.next = first;
        first.next = second;
        second.next = third;
        first.prev = head;
        second.prev = first;
        third.prev = second;

        System.out.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data);
        System.out.println(head.data+"<-" + first.data+"<-" + second.data+"<-" + third.data);

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
    
}
