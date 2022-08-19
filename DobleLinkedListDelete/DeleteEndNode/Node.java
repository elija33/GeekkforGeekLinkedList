package DobleLinkedListDelete.DeleteEndNode;
public class Node {
    int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
  
class Test { 
    
    public static void main(String args[]) 
    { 
        Node head = new Node(10);
    	Node first = new Node(20);
    	Node second = new Node(30);
        Node third = new Node(35);
        Node four = new Node(40);

    	head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
    	first.prev = head;
        second.prev = first;
    	third.prev = second;
        four.prev = third;
    	head=delLast(head);
    	printlist(head);
    	
        System.out.println(head.data+"->" + first.data+"->" + second.data+"->" + third.data+"->" + four.data);
    } 
    
    static Node delLast(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }    
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;
        
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
