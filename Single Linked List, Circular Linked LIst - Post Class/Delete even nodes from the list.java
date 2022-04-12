/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteEven(Node head){
    Node ptr=head.next;
    Node prev = head;        
    while(ptr!=head){
        if(ptr.data%2==0){
            prev.next=prev.next.next;
        }
        else{
            prev=prev.next;
        }
        ptr=ptr.next;
    } 

    return head;

}
