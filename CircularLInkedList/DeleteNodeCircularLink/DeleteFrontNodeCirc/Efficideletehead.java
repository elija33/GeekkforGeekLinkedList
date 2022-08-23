package CircularLInkedList.DeleteNodeCircularLink.DeleteFrontNodeCirc;

import javax.imageio.ImageReadParam;

public class Efficideletehead{
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(14);
        head.next.next = new Node(16);
        head.next.next.next = new Node(18);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = head;
        head = deteleEfficide(head);
        printlist(head);
    }

    public static void printlist(Node head){
        if(head == null)
            return;
            Node list= head;
            do{
                System.out.print(list.data+"->");
                list = list.next;
            }while(list != head);
    }

    // Deteling the firs node.
    public static Node deteleEfficide(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        
    // switcing the element for the head and next element after the head 
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}