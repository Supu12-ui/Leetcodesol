class Solution {
    public boolean backspaceCompare(String s, String t) {
      String ans1=solve(s);
        String ans2=solve(t);
        System.out.println(ans1+" "+ans2);
        
        if(ans1.equals(ans2))
        {
            return true;
        }
        return false;
      
    }
    String solve(String s)
    {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#'&& ans.length()!=0)
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else if(s.charAt(i)!='#')
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}


class solution {
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