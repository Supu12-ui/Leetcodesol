class Solution {
    public boolean isValid(String s) {
       return cal(s);
    }
    boolean cal(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='['||c=='{'||c=='(')
            {
                s.push(c);
            }
            else
            {
                if(s.size()>0&&check(s,c))
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(s.size()!=0)
        {
            return false;
        }
        return true;
    }
    boolean check(Stack<Character> s,char c)
    {
        if(s.peek()=='[' && c==']')
        {
            return true;
        }
        else if(s.peek()=='{' && c=='}')
        {
            return true;
        }
        else if(s.peek()=='(' && c==')')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}