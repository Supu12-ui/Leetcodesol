class Solution {
    int dp[][]=new int[1001][1001];
    public int minimumDeleteSum(String s1, String s2) {
        return memo(s1,s2,0,0);
    }
    //recursion
      int rec(String s1,String s2)
      {
          if(s1.length()==0 && s2.length()==0)
          {
              return 0;
          }
          else
          {
          if(s1.length()!=0&& s2.length()==0)
          {
              int count=0;
              for(int i=0;i<s1.length();i++)
              {
                   count=(int)s1.charAt(i)+count;
              }
              return count;
          }
          if(s2.length()!=0&&s1.length()==0)
          {
              int count=0;
              for(int i=0;i<s2.length();i++)
              {
                  count=(int)s2.charAt(i)+count;
              }
              return count;
         
          }
          }
          int prev=s1.charAt(0);
          int next=s2.charAt(0);
         int min=Integer.MAX_VALUE;
          if(prev==next)
          {
             int rec1=  rec(s1.substring(1),s2.substring(1));
              return rec1;
          }
          else
          {

                  int recan=rec(s1.substring(1),s2)+(int)prev;
           
             
                  int recan2=rec(s1,s2.substring(1))+(int)next;
                   min=Math.min(recan,recan2);
              
                   
              
             
          }
           System.out.println(min);
          return min;
          
}
    public int memo(String s1,String s2,int p,int q)
    {
        
          if(s1.length()==p && s2.length()==q)
          {
              return  dp[p][q]=0;
          }
          else
          {
          if(p!=s1.length()&& s2.length()==q)
          {
              int count=0;
              for(int i=p;i<s1.length();i++)
              {
                   count=(int)s1.charAt(i)+count;
              }
              return dp[p][q]=count;
          }
          if(s2.length()!=q&&s1.length()==p)
          {
              int count=0;
              for(int i=q;i<s2.length();i++)
              {
                  count=(int)s2.charAt(i)+count;
              }
              return dp[p][q]=count;
         
          }
          }
        if(dp[p][q]!=0)
        {
            return dp[p][q];
        }
          int prev=s1.charAt(p);
          int next=s2.charAt(q);
         int min=Integer.MAX_VALUE;
          if(prev==next)
          {
             int rec1=  memo(s1,s2,p+1,q+1);
              return dp[p][q]=rec1;
          }
          else
          {

                  int recan=memo(s1,s2,p+1,q)+(int)prev;
           
             
                  int recan2=memo(s1,s2,p,q+1)+(int)next;
                   min=Math.min(recan,recan2);
              
                   
              
             
          }
          
          return dp[p][q]=min;
    }
        public int lcs(String s1,String s2)
        {
            int n=s1.length();
            int m=s2.length();
            int dp[][]=new int[n+1][m+1];
            for(int i=1;i<n+1;i++)
            {
                for(int j=1;j<m+1;j++)
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
            }
            String str="";
            int row=n,col=m;
            while(row!=0 && col!=0)
            {
                if(s1.charAt(row-1)==s2.charAt(col-1))
                {
                    str=s1.charAt(row-1)+str;
                    row--;
                    col--;
                }
                else
                {
                    if(dp[row-1][col]>=dp[row][col-1])
                    {
                        row--;
                    }
                    else
                    {
                        col--;
                    }
                }
            }
            System.out.println(str);
            return 0;
        }
}