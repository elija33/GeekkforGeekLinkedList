package DobleLinkelist.InsertElementEndDoblelinke;

import javax.crypto.interfaces.PBEKey;

public class InsertNodeEnd {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int d){
            next = null;
            data = d;
            prev = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(25);
        Node third = new Node(25);
        Node four = new Node(30);

        


        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
        first.prev = head;
        second.prev = first;
        third.prev = second;
        four.prev = third;
        printlist(head);

        System.out.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data+"->" + four.data);
        System.out.println(head.data+"<-" + first.data+"<-" + second.data+"<-" + third.data+"<-" + four.data);
    }

    public static Node insertNodeAtEnd(Node head, int data){
        Node temp = new Node(data);
        if(head == null)
            return temp;
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
            temp.prev = curr;
            return curr;
    }

    public static void printlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
}
