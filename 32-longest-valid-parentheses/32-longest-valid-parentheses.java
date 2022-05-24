class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        st.push(-1);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    int val=i-st.peek();
                    max=Math.max(val,max);
                }
            }
        }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
    }
}