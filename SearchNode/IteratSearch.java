package SearchNode;

public class IteratSearch {
    public static class Node{
        int data;
        Node next;

        public Node(int k){
            data = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(20);
        Node first = new Node(25);
        Node second = new Node(30);
        Node third = new Node(35);
        Node four = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;

        System.out.println(head.data+"->" + first.data+"->" + second.data+"->" +
                        third.data+"->" + four.data);
        System.out.println();

        printlist(head);
    }

    public static int search(Node head, int target){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == target){
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
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
