class MyStack {
 Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        if(q.size()==0)
        {
            q.add(x);
        }
        else
        {
            q.add(x);
            int size=q.size();
            while(size>1)
            {
                int val=q.poll();
                q.add(val);
                size--;
            }
        }
    }
    
    public int pop() {
        if(q.size()==0)
        {
            return -1;
        }
        return q.poll();
    }
    
    public int top() {
        if(q.size()==0)
        {
            return -1;
        }
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0)
        {
            return true;
        }
        return false;
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