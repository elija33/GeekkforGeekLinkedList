package LinkedListImplement;

public class LinkedListImplem{

//Methond in LinkedList
    public static class Node{

// vaulabe called data that hold data for linkedlist
        public int data;

// vaulabe called next that hold connebt the node together in linkedlist
        public Node next;

// cretea constructor that hold vaule of k 
        public Node(int k) {

    // set the k to data
            data = k;

        // set next to null , which means the end of the linkedlist.
            next = null;
        }
    }
    public static void main(String[] args) {

    //set up the node to the head of the linking list which is the first element in the linkedlist
        Node head = new Node(10);

    // Set up the second node to second element in the linkedlist
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        
    // connect the head to the second element in the linkedlist
        head.next = second;

     // connect the second node to the third node which is the third element in the linkedlist
        second.next = third;

    // connect the third node to the fourth node which is the four element in the linkedlist
        third.next = four;

        //print out the linked list by useing "--> between each node"
        System.out.println(head.data+"-->"+second.data+"-->"+third.data+"-->"+four.data);
    }
}