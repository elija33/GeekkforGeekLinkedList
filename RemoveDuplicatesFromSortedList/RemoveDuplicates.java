package RemoveDuplicatesFromSortedList;

public class RemoveDuplicates {
    public static class Node{
        int date;
        Node next;

        public Node(int k){
            date = k;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(10);
        Node thirthNode = new Node(10);
        Node four = new Node(15);
        Node five = new Node(17);
        Node six = new Node(16);
        Node seve = new Node(20);
        Node eight = new Node(15);
        Node nine = new Node(16);
        Node ten = new Node(16);
        Node eleven = new Node(19);

        head.next = second;
        second.next = thirthNode;
        thirthNode.next = four;
        four.next = five;
        five.next = six;
        six.next = seve;
        seve.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = eleven;

        System.out.println(head.date+"->" + second.date+"->" + thirthNode.date+"->" + four.date+"->" 
                + five.date+"->" + six.date+"->"+ seve.date+"->" + eight.date+"->" 
                + nine.date+"->" + ten.date+"->" + eleven.date);

}

        public static void remove(Node head){
            Node curr = head;
            while(curr != null && curr.next != null){
                if(curr.date == curr.next.date){
                    curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
    }
}
