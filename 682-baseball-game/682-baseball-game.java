class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ops.length;i++)
        {
            if(check(ops[i]))
            {
                
                int val=Integer.parseInt(ops[i]);
                st.push(val);
            }
            else 
            {
                if(st.size()>0 && ops[i].equals("D"))
                {
                    int value=2*st.peek();
                    st.push(value);
                }
            else if(st.size()>0 && ops[i].equals("C"))
                {
                    st.pop();
                }
                else if(st.size()>0 && ops[i].equals("+"))
                {
                    int val1=st.pop();
                    int val2=st.pop();
                    st.push(val2);
                    st.push(val1);
                    val1=val1+val2;
                    st.push(val1);
                }
                
            }
        }
        int sum=0;
       while(!st.isEmpty())
       {
           int val=st.pop();
           sum=sum+val;
       }
        return sum;
    }
    boolean check(String str)
    {
        if(str.equals("D")||str.equals("C")||str.equals("+"))
        {
            return false;
        }
        return true;
    }
}