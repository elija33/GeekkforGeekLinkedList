package DobleLinkedListDelete.DeleteFirstNode;

public class DeleteFirstNode {

    public static class Node{
        Node next;
        int data;
        Node prev;

        public Node(int k){
            data = k;
            next = null;
            prev = null;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(25);
        Node third = new Node(30);

        head.next = first;
        first.next = second;
        second.next = third;
        first.prev = head;
        second.prev = first;
        third.prev = second;
        head = dfirts(head);
        printlist(head);

        System.err.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data);
        System.out.println(head.data+"<-" + first.data+"<-" + second.data+"<-" + third.data);
        System.out.println();
    }

    private static Node dfirts(Node head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        else{
            head = head.next;
            head = head.prev;
        }
        return head;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
        System.out.println();
    }
}
