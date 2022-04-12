/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {

Node new_node = new Node(k);
    new_node.next = head;
    head = new_node;

    return head;//enter your code here
}
