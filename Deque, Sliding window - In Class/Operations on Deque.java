static void push_back_pb(Deque<Integer> dq, int x)
{
      dq.add(x);
 }
 static void push_front_pf(Deque<Integer> dq, int x)
 {
        dq.addFirst(x);
 }
 static void pop_back_ppb(Deque<Integer> dq)
 {     
       if(dq.isEmpty()){
            //    System.out.println(-1);
               return;
       }
       dq.pollLast();
 }
static int front_dq(Deque<Integer> dq)
{
        if(dq.isEmpty()){
           return -1;
        }
       return dq.peek();
}
