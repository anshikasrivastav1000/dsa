package LinkedList;



class Node{
int val;
Node next;
     Node(int value) {
         val = value;
         next = null;
    }
}
public class HowToCreateNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        System.out.println(head.val);

        Node newNode = new Node(2);
        //connection for first and second node
        head.next = newNode;

        Node newNode2 = new Node(3);
        //connection for second node and 3rd
        newNode.next = newNode2;
    }
}
