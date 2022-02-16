class Solution {
    
    public int minCut(String s) {
     int dp[][]=new int[s.length()+1][s.length()+1]; 
        for(int i=0;i<s.length()+1;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
       return solved(s,0,s.length()-1,dp);
    }
    int solved(String s,int i,int j,int dp[][])
    {
        if(i>=j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(palindrome(s,i,j))
        {
            return dp[i][j]=0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            if(palindrome(s,i,k))
            {
                int temp=1+solved(s,k+1,j,dp);
                min=Math.min(temp,min);
                
            }
           
            
            
        }
        dp[i][j]=min;
        return dp[i][j];
        
    }
    boolean palindrome(String str,int i,int j)
    {
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}