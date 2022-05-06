class Solution {
    public String removeDuplicates(String s, int k) {
        return solve(s,k);
    }
    String solve(String s,int k)
    {
        Stack<pair> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(st.size()==0)
            {
                pair p=new pair(temp,1);
                st.push(p);
            }
            else if(st.size()!=0 && st.peek().ch==temp)
            {
               pair p=st.peek();
                p.c=p.c+1;
                if(p.c==k)
                {
                    st.pop();
                }
               
            }
            else
            {
              pair p=new pair(temp,1);
                st.push(p);
            }
        }
        String ans="";
        while(st.size()!=0)
        {
           
            pair p=st.pop();
            for(int i=0;i<p.c;i++)
            {
                ans=p.ch+ans;
            }
        }
        
        return ans;
    }
}
class pair
{
     char ch;
     int c;
    pair(char ch,int c)
    {
        this.ch=ch;
        this.c=c;
    }
}