class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int sm=-Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(st.size()==0)
            {
                st.push(nums[i]);
                continue;
            }
            else if(nums[i]>st.peek())
            {
                while(st.size()>0 && nums[i]>st.peek())
                {
                    sm=st.peek();
                    st.pop();
                }
            
            }
            else if(nums[i]<sm)
            {
                return true;
            }
            st.push(nums[i]);
        }
        return false;
    }
}