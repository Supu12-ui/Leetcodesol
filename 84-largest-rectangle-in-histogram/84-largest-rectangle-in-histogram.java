class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        nsl(heights,n,left);
        nsr(heights,n,right);
        int max=0;
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(left[i]);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(right[i]);
        // }
        for(int i=0;i<n;i++)
        {
           int val=right[i]-left[i]-1;
            val=val*heights[i];
            max=Math.max(max,val);
        }
        return max;
    }
    //nsr
    void nsr(int a[],int n,int ans[])
    {
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            if(st.size()==0)
            {
                ans[i]=n;
            }
            if(st.size()>0 && a[i]>a[st.peek()])
            {
                ans[i]=st.peek();
            }
            else
            {
                while(st.size()>0 && a[i]<=a[st.peek()])
                {
                    st.pop();
                }
                if(st.size()==0)
                {
                    ans[i]=n;
                }
                else
                {
                    ans[i]=st.peek();
                }
            }
            st.push(i);
        }
        // for(int i=0;i<n;i++)
        // {
        //     ans[i]=i-ans[i];
        // }
    }
    
    
    
    
    
    //nsl
    void nsl(int a[],int n,int ans[])
    {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            {
                ans[i]=-1;
            }
            if(st.size()>0 && a[i]>a[st.peek()])
            {
                ans[i]=st.peek();
            }
            else
            {
                while(st.size()>0 && a[i]<=a[st.peek()])
                {
                    st.pop();
                }
                if(st.size()==0)
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=st.peek();
                }
            }
            st.push(i);
        }
        // for(int i=0;i<n;i++)
        // {
        //     ans[i]=i-ans[i];
        // }
        
    }
    
    
}