package DobleLinkelist.InseNodeBegDoblelink;

public class InseNodefront {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int k){
            data = k;
            next = null;
            prev = null;
        }

        public static void main(String[] args) {
            Node head = new Node(10);
            Node first = new Node(15);
            Node second = new Node(20);
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
            head = insertBeging(head, 5);
            //printlist(head);

            System.out.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data+"->" + four.data);
            System.out.println(head.data+"<-" + first.data+"<-" + second.data+"<-" + third.data+"<-" + four.data);
        }

        public static Node insertBeging(Node head, int data){
            Node tem = new Node(data);
            tem.next = head;
            if(head != null){
                head.prev = tem;
            }
            return tem;
        }

       /* public static void printlist(Node head){
            Node curr = head;
            while(curr != null){
                System.out.println(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        } */
    }
}
