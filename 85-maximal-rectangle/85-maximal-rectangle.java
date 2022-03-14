class Solution {
    public int maximalRectangle(char[][] matrix) {
       int n=matrix.length;
        int m=matrix[0].length;
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
          a[i]=matrix[0][i]-'0';
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(a[i]+" ");
        }
        int max=mah(a,m);
        System.out.println(max);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]=='0')
                {
                    a[j]=0;
                }
                else
                {
                    a[j]=a[j]+(matrix[i][j]-'0');
                }
            }
            for(int k=0;k<m;k++)
        {
            System.out.print(a[k]+" ");
        }
            int val=mah(a,m);
            max=Math.max(max,val);
        }
        return max;
    }
    static int mah(int a[],int n)
    {
      int left[]=new int[n];
        int right[]=new int[n];
        nsl(a,n,left);
        nsr(a,n,right);
        int max=-1;
        for(int i=0;i<n;i++)
        {
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(right[i]+" ");
        }
        
        for(int i=0;i<n;i++)
        {
           int val=right[i]-left[i]-1;
           val=val*a[i];
            max=Math.max(val,max);
        }
        System.out.println(max);
        return max;
    }
    //nsr
    static void nsr(int a[],int n,int ans[])
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
    }
    
    
    //nsl
    static void nsl(int a[],int n,int ans[])
    {
        Stack<Integer> st=new Stack<>();
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
    }
}