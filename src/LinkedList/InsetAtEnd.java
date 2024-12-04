package LinkedList;
//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class InsetAtEnd {
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;

        while (temp != null && temp.next != null){
            temp = temp.next;
        }

        Node newNode = new Node(x);
        temp.next = newNode;
        return head;
    }
}
