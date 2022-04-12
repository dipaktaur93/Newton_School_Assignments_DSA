/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

static void BToDLL(Node root)  
    {  
        if(root.left != null) {
            BToDLL(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right != null) {
            BToDLL(root.right);
        }
    }
