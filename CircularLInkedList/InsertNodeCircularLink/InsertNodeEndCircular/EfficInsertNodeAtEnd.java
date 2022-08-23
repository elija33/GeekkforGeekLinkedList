package CircularLInkedList.InsertNodeCircularLink.InsertNodeEndCircular;

public class EfficInsertNodeAtEnd {
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
        Node head = new Node(20);
        head.next = new Node(18);
        head.next.next = new Node(16);
        head.next.next.next = new Node(14);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next.next.next = new Node(2);
        printlist(head);
        head = insertNodeEnd(head, 1);
    }

    public static void printlist(Node head){
        if(head == null)
        return;
        Node list = head;
        do{
            System.out.print(list.data+ "->");
            list = list.next;
        }
        while(list != head);
    }

    //Inserting a nodd at the end 
    public static Node insertNodeEnd(Node head, int givenumber){
        Node temp = new Node(givenumber);
            if(head == null){
                temp.next = temp;
                return temp;
            }  
            else{
                temp.next = head.next;
                head.next = temp;
                int ta = temp.data;
                head.data = temp.data;
                temp.data = ta;
                return temp;
            }
    }
}
