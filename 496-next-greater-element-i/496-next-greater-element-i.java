class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n];
        int right[]=new int[m];
        Stack<Integer> st=new Stack<>();
        for(int i=m-1;i>=0;i--)
        {
            if(st.size()==0)
            {
                right[i]=-1;
            }
            if(st.size()>0&&nums2[i]<st.peek())
            {
                right[i]=st.peek();
                
            }
            else
            {
                while(st.size()>0 && nums2[i]>st.peek())
                {
                    st.pop();
                }
                if(st.size()==0)
                {
                    right[i]=-1;
                }
                else
                {
                    right[i]=st.peek();
                }
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                   ans[i]=right[j];
                }
            }
           
        }
        return ans;
        
    }
}