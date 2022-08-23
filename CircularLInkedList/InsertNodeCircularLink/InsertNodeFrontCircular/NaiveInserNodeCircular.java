package CircularLInkedList.InsertNodeCircularLink.InsertNodeFrontCircular;

public class NaiveInserNodeCircular{
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int da){
            data = da;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);
        head.next.next.next.next = new Node(18);
        head.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next = new Node(22);
        head.next.next.next.next.next.next.next = head;
        head = insertfront(head, 8);
        //printlist(head);
        
        System.out.println(head.data+"->" + head.next.data+"->" + head.next.next.data+"->" + head.next.next.next.data+"->" + head.next.next.next.next.data+"->"  
        + head.next.next.next.next.next.data+"->" + head.next.next.next.next.next.next.data+"->" + head.next.next.next.next.next.next.next.data);
    }
       /*public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }
        while(r!=head);
       }*/

       public static Node insertfront(Node head,int givenumber){
        Node temp = new Node(givenumber);
        if(head == null)
            temp.next = temp;
        else{
            Node curr = head;
            while(curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }
}