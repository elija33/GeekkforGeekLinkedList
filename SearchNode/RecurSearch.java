package SearchNode;

public class RecurSearch {
    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
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

        System.out.println(head.data+"->"+ first.data+"->"+ second.data+"->"+ 
                        third+"->"+ four+"->" + five);
        System.out.println();

        printlist(head);
    }

        public static int search(Node head, int target){
            if(head == null){
                return -1;
            }
            if(head.data == target){
                return 1;
            }
            else{
                int res = search(head.next, target);
                if(res == -1){
                    return -1;
                }
                else{
                    return res + 1;
                }
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
