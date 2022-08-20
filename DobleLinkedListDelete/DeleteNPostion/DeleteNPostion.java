package DobleLinkedListDelete.DeleteNPostion;

public class DeleteNPostion {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int d){
            data = d;
            next = null;
            prev = next;
        }
    }

    public void push(int newdata){
        Node newnode = new Node(newdata);
        newnode.next = head;
        newnode.prev = null;

        if(head != null)
            head.prev = newnode;
            head = newnode;

            head = newnode;
    }

    public void deleteNode(Node del){
        if(head == null || del == null){
            return;
        }

        if(head == del){
            head = del.next;
        }

        if(del.next != null){
            del.next.prev = del.prev;
        }

        if(del.prev != null){
            del.prev.next = del.next;
        }

        return;
    }

    public void printlist(Node node){
        Node last = null;
        while(node != null){
            System.out.println(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteNPostion postion = new DeleteNPostion();
        postion.push(10);
        postion.push(15);
        postion.push(20);
        postion.push(25);
        postion.push(30);

        System.out.println("Original Linked list");
        postion.printlist(postion.head);

		postion.deleteNode(postion.head); /*delete first node*/
		//postion.deleteNode(postion.head.next); /*delete middle node*/
		//postion.deleteNode(postion.head.next); /*delete last node*/

		System.out.print(
			"\nModified Linked list ");
		postion.printlist(postion.head);
    }
}
