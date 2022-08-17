package LinkedListInsert;

public class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public class LinkedList{
        Node head;

    // Adding node in a linkedlist 
    public void append(int data){

//checking if the head of linkedlist is null link the head to a new node.
        if(head == null){
            head = new Node(data);
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    public void perpend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // deleting a node in a linkedlist
    public void deleteWithValue(int data){

    // checking if head of the linkedlist is empty
        if(head == null){
            return;
        }

    // check if the element we deleting is the head of the linkedlist
        if(head.data == data){
            head = head.next;
            return;
        }

    // Else look for the node of linkedlist and delete it.
        Node curr = head;
        while(curr.next.data == data){
            curr.next = curr.next.next;
            return;
        }
        curr = curr.next;
    }
}
public static void main(String[] args) {
    Node head = new Node(10);
    Node first = new Node(15);
    Node second = new Node(20);
    Node third = new Node(25);
    Node four = new Node(30);
    Node five = new Node(35);

    head.next = first;
    first.next = second;
    second.next = third;
    third.next = four;
    four.next = five;

    System.out.println(head.data+"->" + first.data+"->" + second.data+"->" +
                third+"->" + four+"->" + five);
    System.out.println();
}
}
