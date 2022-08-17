package LinkedListInsert;

public class InsetNPosition {

    // A linked list Node
    public static class Node{
        int data;
        Node next;

    // Inserting the required data
        public Node(int date){
            data = date;
            next = null;
        }
    }

    // function to create and return a Node
    public static Node GetNode(int date){
        return new Node(date);
    }

    // function to insert a Node at required position
    public static Node InsertPos(Node headNode, int position, int data){
        Node head = headNode;
        if(position < 1){
            System.out.println("Invalid position");

    //if position is 1 then new node is set infornt of head node head node is changing.
            if(position == 1){
                Node newNode = new Node(data);
                newNode.next = headNode;
                head = newNode;
            }
            else{
                while(position-- != 0){
                    if(position == 1){

                // Adding node at required position
                        Node newNode = GetNode(data);

                // Makng the new node point to the old node at the same position
                        newNode.next = headNode.next;
                    
                // Replacing current with new Node to the old Node to point to the new Node
                        headNode.next = newNode;
                        break;
                    }

                    headNode = headNode.next;
                }

                if(position != 1){
                    System.out.println("Position out of range");
                }
            }
        }
        return head;
    }

    public void PrintList(Node node) {
        while(node != null){
            System.out.println(node.data);
            node = node.next;
            if(node != null){
                System.out.println(",");
            }
        }
        System.out.println();
    }
}
