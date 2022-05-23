class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][][]=new int[m+1][n+1][strs.length+1];
      int val=solve(dp,strs,m,n,0);
        return val;
     }
    int solve(int dp[][][],String str[],int m,int n,int index)
    {
        if(index==str.length||m+n==0)
        {
            return 0;
        }
        if(dp[m][n][index]>0)
        {
            return dp[m][n][index];
        }
        int counts[]=counts(str[index]);
        int accept=0;
        if(counts[0]<=m && counts[1]<=n)
        {
             accept=1+solve(dp,str,m-counts[0],n-counts[1],index+1);
        }
        int reject=solve(dp,str,m,n,index+1);
        int max=Math.max(accept,reject);
        return dp[m][n][index]=max;
    }
    int []counts(String str)
    {
        int count[]=new int[2];
        int zero=0;
        int one=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                one++;
            }
            else
            {
                zero++;
            }
        }
        count[0]=zero;
        count[1]=one;
        return count;
    }
    
}
class solution {
    public int findMaxForm(String[] strs, int m, int n) {
        ArrayList<pair> temp=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            String str=strs[i];
            int zeros=0;
            int ones=0;
            for(int j=0;j<str.length();j++)
            {
               if(str.charAt(j)=='1')
               {
                  ones++; 
               }
                else
                {
                    zeros++;
                }
            }
            
            pair p=new pair(str,ones,zeros);
            temp.add(p);
            
        }
    int count=0;
      for(int i=0;i<temp.size();i++)
      {
          pair p=temp.get(i);
          count=0;
          int countm=0;
          int countn=0;
           countm+=p.zero;
          countn+=p.one;
          if(countm>m||countn>n)
          {
              continue;
          }
          else
          {
           count++;   
          }
          System.out.println(p.str+" "+countm+" "+countn);
          for(int j=i+1;j<temp.size();j++)
          {
              pair p1=temp.get(j); 
              countm+=p1.zero;
              countn+=p1.one;
              if(countm>m || countn>n)
              {
                  countm=countm-p1.zero;
                  countn=countn-p1.one;
              }
             else if(countm<0||countn<0)
              {
                  break;
              }
              else
              {
                  count++;
              }
              System.out.println(p1.str+" "+countm+" "+countn+"count"+count);
              
          }
          max=Math.max(max,count);
      }
        if(max==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max;
}
}
class pair
{
    String str="";
    int one=0;
    int zero=0;
    public pair(String str,int one,int zero)
    {
      this.str=str;
    this.one=one;
    this.zero=zero;
    }
    
}