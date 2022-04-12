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
// 1->2->3->4->5->>null
// p.               a
//k=5
// 1->2->3->4->6->7->null
//count=0

public static Node deleteElement(Node head,int k) {
 Node prev=head;
 Node ahead=head;
 int count=0;

 while(count<k){
     ahead=ahead.next;
     count++;
 }

if(ahead==null)
{
    head=head.next;
    return head;
}
 while(ahead.next!=null){
     prev=prev.next;
     ahead=ahead.next;
 }
 prev.next=prev.next.next;
return head;

}
