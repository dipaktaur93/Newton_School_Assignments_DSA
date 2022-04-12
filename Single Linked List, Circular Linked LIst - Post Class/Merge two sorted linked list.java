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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
static Node s1, s2;

public static Node insertEnd(int val){
    if(s1 == null){
        s1 = new Node(val);
        s2 = s1;
    }
    else{
        Node newnode = new Node(val); //(2, null)
        s2.next = newnode;
        s2 = s2.next;
    }
    return s1;
}

public static Node Merge (Node head1, Node head2){
     s1 = null;
    s2 = null;
    while(head1!=null && head2!=null){
        if(head1.val <= head2.val){
            s1 = insertEnd(head1.val);
            head1 = head1.next;
        }
        else{
            s1 = insertEnd(head2.val);
            head2 = head2.next;
        }
    }
    while(head1 != null){
        s1 = insertEnd(head1.val);
        head1 = head1.next;
    }
    while(head2 != null){
        s1 = insertEnd(head2.val);
        head2 = head2.next;
    }
    return s1;
}
