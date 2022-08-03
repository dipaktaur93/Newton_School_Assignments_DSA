//Enter your code here
        /*pairsum it1 = new pairsum(root1);
        pairsum it2 = new pairsum(root2);
        int count = 0;
        while(it1.hasNext() && it2.hasNext()){
            Node n1 = it1.peek();
            Node n2 = it2.peek();
            int sum = n1.data+n2.data;
            if(sum == target){
                count++;
                it1.next();
                it2.next();
            }
            else if(sum > target){
                it2.next();
            }else{
                it1.next();
            }
        }
        return count;
    }*/

    public static void traverse(Node root,HashMap<Integer,Integer> mp){
    if(root==null){
        return;
    }
    if(mp.containsKey(root.data)){
        mp.put(root.data,mp.get(root.data)+1);
    }
    else{
        mp.put(root.data,1);
    }
    traverse(root.left,mp);
    traverse(root.right,mp);
    return;
}
static boolean pairsum(Node root1, Node root2, int target){
    HashMap<Integer,Integer> mp = new HashMap<>();
    traverse(root1,mp);
    traverse(root2,mp);
    for(Map.Entry<Integer,Integer> e:mp.entrySet()){
        int x = target-e.getKey();
        if(x==e.getKey()){
            if(e.getValue()>1){
                return true;
            }
        }
        else{
            if(mp.containsKey(x)==true){
                return true;
            }
        }
    }
    return false;
}
