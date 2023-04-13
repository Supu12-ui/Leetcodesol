class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        int m=popped.length;
        Stack<Integer> st=new Stack<>();
        int j=0;
         for(int i=0;i<n;i++)
         {
          st.push(pushed[i]);
          while(st.size()!=0 && st.peek()==popped[j])
          {
              st.pop();
              j++;
          }
         }
        if(st.size()==0)
        {
            return true;
        }
        return false;
    }
}