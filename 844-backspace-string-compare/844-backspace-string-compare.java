class Solution {
    public boolean backspaceCompare(String s, String t) {
      String ans1=solve(s);
        String ans2=solve(t);
        if(ans1.equals(ans2))
        {
            return true;
        }
        return false;
    }
    String solve(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
            if(ch!='#')
            {
                st.push(ch);
            }
            else if(st.size()!=0)
            {
                st.pop();
            }
        }
        String ans="";
        while(st.size()!=0)
        {
            char ch=st.pop();
            ans=ans+ch;
        }
        return ans;
    }
}