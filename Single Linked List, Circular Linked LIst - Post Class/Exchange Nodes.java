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

static Node exchangeNodes(Node head)
    {
 
        // If list is of length 2
        if (head.next.next == head) {
            head = head.next;
            return head;
        }
        
        Node p = head;
        while (p.next.next != head)
            p = p.next;
         p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;
 
        return head;
    }
