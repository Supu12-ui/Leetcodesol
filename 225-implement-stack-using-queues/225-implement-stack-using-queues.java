class MyStack {
  Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
     q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(q1.size()==0)
        {
            q1.add(x);
        }
        else
        {
            while(q1.size()!=0)
            {
                int val=q1.poll();
                q2.add(val);
            }
            q1.add(x);
            while(q2.size()!=0)
            {
                int val=q2.poll();
                q1.add(val);
            }
        }
    }
    
    public int pop() {
        if(q1.size()==0)
        {
            return -1;
        }
        else
        {
            return q1.poll();
        }
        
    }
    
    public int top() {
        if(q1.size()==0)
        {
            return -1;
        }
        else
        {
            int val=q1.peek();
            return val;
        }
        
    }
    
    public boolean empty() {
        
        if(q1.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */