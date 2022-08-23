package CircularLInkedList.InsertNodeCircularLink.InsertNodeFrontCircular;

public class EffiInsertNodeCirc {
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
        Node head = new Node(90);
        head.next = new Node(92);
        head.next.next = new Node(94);
        head.next.next.next = new Node(96);
        head.next.next.next.next = new Node(98);
        head.next.next.next.next.next = new Node(100);
        head = insertfront(head, 88);
        printlist(head);

        System.out.println(head.next.data+"->" + head.next.next.data+"->" + head.next.next.next.data+"->" 
                    + head.next.next.next.next.data+"->" + head.next.next.next.next.next.data+"->" + head.next.next.next.next.next.next.data);
    } 
    
    public static void printlist(Node head){
        if(head == null)
        return;
        Node curr = head;
        do{
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        while(curr != head);
    }
    
    public static Node insertfront(Node head, int givenumber){
        Node temp = new Node(givenumber);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else {
            temp.next = head.next;
            head.next = temp;
            int curr = head.data;
            head.data = temp.data;
            temp.data = curr;
            return head;
        }
    }
}
